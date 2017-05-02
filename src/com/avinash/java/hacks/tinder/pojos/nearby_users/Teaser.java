
package com.avinash.java.hacks.tinder.pojos.nearby_users;

import com.google.gson.annotations.SerializedName;

public class Teaser {
    @SerializedName("string")
    private String string;

    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
}
