
package com.freakynit.java.hacks.tinder.pojos.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Bounds {

    @SerializedName("sw")
    @Expose
    private Sw sw;
    @SerializedName("ne")
    @Expose
    private Ne ne;
    public Sw getSw() {
        return sw;
    }
    public void setSw(Sw sw) {
        this.sw = sw;
    }
    public Ne getNe() {
        return ne;
    }
    public void setNe(Ne ne) {
        this.ne = ne;
    }
}
