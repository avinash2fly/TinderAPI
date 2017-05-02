
package com.avinash.java.hacks.tinder.pojos.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class State {

    @SerializedName("bounds")
    @Expose
    private Bounds bounds;
    @SerializedName("name")
    @Expose
    private String name;
    public Bounds getBounds() {
        return bounds;
    }
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
