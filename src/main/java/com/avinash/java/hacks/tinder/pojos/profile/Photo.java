
package com.freakynit.java.hacks.tinder.pojos.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Photo {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("processedFiles")
    @Expose
    private List<ProcessedFile> processedFiles = new ArrayList<ProcessedFile>();
    @SerializedName("fbId")
    @Expose
    private String fbId;
    @SerializedName("main")
    @Expose
    private Boolean main;
    @SerializedName("fileName")
    @Expose
    private String fileName;
    @SerializedName("crop")
    @Expose
    private String crop;
    @SerializedName("extension")
    @Expose
    private String extension;
    @SerializedName("shape")
    @Expose
    private String shape;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public List<ProcessedFile> getProcessedFiles() {
        return processedFiles;
    }
    public void setProcessedFiles(List<ProcessedFile> processedFiles) {
        this.processedFiles = processedFiles;
    }
    public String getFbId() {
        return fbId;
    }
    public void setFbId(String fbId) {
        this.fbId = fbId;
    }
    public Boolean getMain() {
        return main;
    }
    public void setMain(Boolean main) {
        this.main = main;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getCrop() {
        return crop;
    }
    public void setCrop(String crop) {
        this.crop = crop;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
}
