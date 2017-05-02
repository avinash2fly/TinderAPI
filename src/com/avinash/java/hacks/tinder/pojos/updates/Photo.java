
package com.freakynit.java.hacks.tinder.pojos.updates;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Photo {

    @SerializedName("xdistance_percent")
    @Expose
    private Long xdistancePercent;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("xoffset_percent")
    @Expose
    private Long xoffsetPercent;
    @SerializedName("yoffset_percent")
    @Expose
    private Long yoffsetPercent;
    @SerializedName("ydistance_percent")
    @Expose
    private Long ydistancePercent;
    @SerializedName("main")
    @Expose
    private Boolean main;
    @SerializedName("fileName")
    @Expose
    private String fileName;
    @SerializedName("fbId")
    @Expose
    private String fbId;
    @SerializedName("extension")
    @Expose
    private String extension;
    @SerializedName("processedFiles")
    @Expose
    private List<ProcessedFile> processedFiles = new ArrayList<ProcessedFile>();
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The xdistancePercent
     */
    public Long getXdistancePercent() {
        return xdistancePercent;
    }

    /**
     * 
     * @param xdistancePercent
     *     The xdistance_percent
     */
    public void setXdistancePercent(Long xdistancePercent) {
        this.xdistancePercent = xdistancePercent;
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
     *     The xoffsetPercent
     */
    public Long getXoffsetPercent() {
        return xoffsetPercent;
    }

    /**
     * 
     * @param xoffsetPercent
     *     The xoffset_percent
     */
    public void setXoffsetPercent(Long xoffsetPercent) {
        this.xoffsetPercent = xoffsetPercent;
    }

    /**
     * 
     * @return
     *     The yoffsetPercent
     */
    public Long getYoffsetPercent() {
        return yoffsetPercent;
    }

    /**
     * 
     * @param yoffsetPercent
     *     The yoffset_percent
     */
    public void setYoffsetPercent(Long yoffsetPercent) {
        this.yoffsetPercent = yoffsetPercent;
    }

    /**
     * 
     * @return
     *     The ydistancePercent
     */
    public Long getYdistancePercent() {
        return ydistancePercent;
    }

    /**
     * 
     * @param ydistancePercent
     *     The ydistance_percent
     */
    public void setYdistancePercent(Long ydistancePercent) {
        this.ydistancePercent = ydistancePercent;
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

}
