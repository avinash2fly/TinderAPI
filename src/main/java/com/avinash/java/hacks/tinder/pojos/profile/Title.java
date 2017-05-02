
package com.freakynit.java.hacks.tinder.pojos.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Title {

    @SerializedName("displayed")
    @Expose
    private Boolean displayed;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    public Boolean getDisplayed() {
        return displayed;
    }
    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
