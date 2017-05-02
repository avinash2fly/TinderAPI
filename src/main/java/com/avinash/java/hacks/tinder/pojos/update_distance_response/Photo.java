
package com.freakynit.java.hacks.tinder.pojos.update_distance_response;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Photo {

    @SerializedName("extension")
    @Expose
    private String extension;
    @SerializedName("crop")
    @Expose
    private String crop;
    @SerializedName("fileName")
    @Expose
    private String fileName;
    @SerializedName("main")
    @Expose
    private Boolean main;
    @SerializedName("fbId")
    @Expose
    private String fbId;
    @SerializedName("processedFiles")
    @Expose
    private List<ProcessedFile> processedFiles = new ArrayList<ProcessedFile>();
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("shape")
    @Expose
    private String shape;

    /**
     * 
     * @return
     *     The extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * 
     * @param extension
     *     The extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * 
     * @return
     *     The crop
     */
    public String getCrop() {
        return crop;
    }

    /**
     * 
     * @param crop
     *     The crop
     */
    public void setCrop(String crop) {
        this.crop = crop;
    }

    /**
     * 
     * @return
     *     The fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 
     * @param fileName
     *     The fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 
     * @return
     *     The main
     */
    public Boolean getMain() {
        return main;
    }

    /**
     * 
     * @param main
     *     The main
     */
    public void setMain(Boolean main) {
        this.main = main;
    }

    /**
     * 
     * @return
     *     The fbId
     */
    public String getFbId() {
        return fbId;
    }

    /**
     * 
     * @param fbId
     *     The fbId
     */
    public void setFbId(String fbId) {
        this.fbId = fbId;
    }

    /**
     * 
     * @return
     *     The processedFiles
     */
    public List<ProcessedFile> getProcessedFiles() {
        return processedFiles;
    }

    /**
     * 
     * @param processedFiles
     *     The processedFiles
     */
    public void setProcessedFiles(List<ProcessedFile> processedFiles) {
        this.processedFiles = processedFiles;
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

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * 
     * @param shape
     *     The shape
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

}
