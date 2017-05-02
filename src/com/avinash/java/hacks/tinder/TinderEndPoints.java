package com.freakynit.java.hacks.tinder;

public enum TinderEndPoints {
    PROFILE ("/profile"),
    UPDATES ("/user/updates"),
    RECOMMENDATIONS ("/user/recs"),
    LIKE ("/like/%s"),
    PASS ("/pass/%s"),
    UPDATE_LOCATION ("/user/ping"),
    MESSAGE ("/user/matches/%s");

    private String endpoint;
    private TinderEndPoints(String endpoint){
        this.endpoint = endpoint;
    }

    public String getEndpoint(){
        return this.endpoint;
    }
}
