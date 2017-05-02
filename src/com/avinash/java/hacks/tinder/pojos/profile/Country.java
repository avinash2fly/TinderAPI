
package com.avinash.java.hacks.tinder.pojos.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Country {

    @SerializedName("cc")
    @Expose
    private String cc;
    @SerializedName("bounds")
    @Expose
    private Bounds bounds;
    @SerializedName("name")
    @Expose
    private String name;
    public String getCc() {
        return cc;
    }
    public void setCc(String cc) {
        this.cc = cc;
    }
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
