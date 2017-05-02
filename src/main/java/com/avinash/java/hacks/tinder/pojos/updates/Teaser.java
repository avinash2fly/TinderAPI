
package com.freakynit.java.hacks.tinder.pojos.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Teaser {

    @SerializedName("string")
    @Expose
    private String string;

    /**
     * 
     * @return
     *     The string
     */
    public String getString() {
        return string;
    }

    /**
     * 
     * @param string
     *     The string
     */
    public void setString(String string) {
        this.string = string;
    }

}
