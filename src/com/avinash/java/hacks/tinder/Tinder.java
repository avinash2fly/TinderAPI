package com.avinash.java.hacks.tinder;


import java.util.HashMap;
import java.util.Map;

import com.avinash.java.hacks.tinder.pojos.nearby_users.NearbyUsers;
import com.avinash.java.hacks.tinder.pojos.profile.Profile;
import com.avinash.java.hacks.tinder.pojos.updates.Updates;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequestWithBody;

public class Tinder {
    private static final String API_HOST = "https://api.gotinder.com";

    private Gson gson = new Gson();
    private String tinderAuthToken;

    public Tinder(String tinderAuthToken){
        this.tinderAuthToken = tinderAuthToken;
    }

    public NearbyUsers getNearbyUsers() throws UnirestException {
        HttpResponse<String> response = addHeaders(Unirest.get(API_HOST + TinderEndPoints.RECOMMENDATIONS.getEndpoint())).asString();
        NearbyUsers nearbyUsers = gson.fromJson(response.getBody(), NearbyUsers.class);

        return nearbyUsers;
    }

    public Profile updateDistance(Integer distance) throws UnirestException {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("distance_filter", distance);

        return getOrUpdateProfile(params);
    }
    public Profile getOrUpdateProfile(Map<String, Object> updateData) throws UnirestException {
        HttpRequestWithBody httpRequestWithBody = addHeaders(Unirest.post(API_HOST + TinderEndPoints.PROFILE.getEndpoint()));
        if(updateData != null) {
            httpRequestWithBody.body(gson.toJson(updateData));
        }

        HttpResponse<String> response = httpRequestWithBody.asString();
        Profile profile = gson.fromJson(response.getBody(), Profile.class);

        return profile;
    }

    public Updates getUpdates() throws UnirestException {
        HttpResponse<String> response = addHeaders(Unirest.get(API_HOST + TinderEndPoints.UPDATES.getEndpoint())).asString();
        Updates updates = gson.fromJson(response.getBody(), Updates.class);

        return updates;
    }

    // Helper
    private GetRequest addHeaders(GetRequest getRequest){
        getRequest.header("x-auth-token", "4e10f448-d9d1-4d66-8462-04df306e9dc6")
        .header("user-agent", "Tinder/4.0.4 (iPhone; iOS 7.1.1; Scale/2.00)")
        .header("authorization", "Token token=\"4e10f448-d9d1-4d66-8462-04df306e9dc6\"")
        .header("cache-control", "no-cache");

        return getRequest;
    }

    private HttpRequestWithBody addHeaders(HttpRequestWithBody httpRequestWithBody){
        httpRequestWithBody.header("x-auth-token", this.tinderAuthToken)
                .header("user-agent", "Tinder/4.0.4 (iPhone; iOS 7.1.1; Scale/2.00)")
                .header("authorization", "Token token=\"" + this.tinderAuthToken + "\"")
                .header("cache-control", "no-cache");

        return httpRequestWithBody;
    }
}
