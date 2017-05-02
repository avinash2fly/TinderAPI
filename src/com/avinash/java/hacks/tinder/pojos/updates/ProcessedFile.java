
package com.freakynit.java.hacks.tinder.pojos.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProcessedFile {

    @SerializedName("width")
    @Expose
    private Long width;
    @SerializedName("height")
    @Expose
    private Long height;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The width
     */
    public Long getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Long width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Long getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Long height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
