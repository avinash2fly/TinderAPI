package com.freakynit.java.hacks.tinder.pojos.nearby_users;

import com.google.gson.annotations.SerializedName;

public class ProcessedFile {

    @SerializedName("url")
    private String url;
    @SerializedName("height")
    private Integer height;
    @SerializedName("width")
    private Integer width;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
}
