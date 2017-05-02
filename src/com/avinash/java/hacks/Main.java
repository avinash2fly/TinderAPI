package com.freakynit.java.hacks;

import com.freakynit.java.hacks.tinder.Tinder;
import com.freakynit.java.hacks.tinder.pojos.nearby_users.NearbyUsers;
import com.freakynit.java.hacks.tinder.pojos.nearby_users.ProcessedFile;
import com.freakynit.java.hacks.tinder.pojos.profile.Profile;
import com.freakynit.java.hacks.tinder.pojos.updates.Updates;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {
    public static void main(String[] args) {
        Tinder tinder = new Tinder("<YOUR_TINDER_AUTH_TOKEN_HERE>");
        try {
            //NearbyUsers nearbyUsers = tinder.getNearbyUsers();
            Profile profile  = tinder.getOrUpdateProfile(null);
            System.out.println("Bio: " + profile.getBio());

//            Profile profile2  = tinder.updateDistance(20);
//            System.out.println("Bio: " + profile2.getDistanceFilter());
//            Updates updates = tinder.getUpdates();
//            System.out.println("Birthdate: " + updates.getBirthDate());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
