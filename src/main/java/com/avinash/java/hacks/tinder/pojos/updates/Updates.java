
package com.freakynit.java.hacks.tinder.pojos.updates;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Updates {
    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("birth_date_info")
    @Expose
    private String birthDateInfo;
    @SerializedName("connection_count")
    @Expose
    private Long connectionCount;
    @SerializedName("common_connections")
    @Expose
    private List<Object> commonConnections = new ArrayList<Object>();
    @SerializedName("interest_count")
    @Expose
    private Long interestCount;
    @SerializedName("common_interests")
    @Expose
    private List<Object> commonInterests = new ArrayList<Object>();
    @SerializedName("distance_mi")
    @Expose
    private Long distanceMi;
    @SerializedName("gender")
    @Expose
    private Long gender;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = new ArrayList<Photo>();
    @SerializedName("ping_time")
    @Expose
    private String pingTime;
    @SerializedName("teaser")
    @Expose
    private Teaser teaser;
    @SerializedName("status")
    @Expose
    private Long status;

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * 
     * @param bio
     *     The bio
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * 
     * @return
     *     The birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 
     * @param birthDate
     *     The birth_date
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 
     * @return
     *     The birthDateInfo
     */
    public String getBirthDateInfo() {
        return birthDateInfo;
    }

    /**
     * 
     * @param birthDateInfo
     *     The birth_date_info
     */
    public void setBirthDateInfo(String birthDateInfo) {
        this.birthDateInfo = birthDateInfo;
    }

    /**
     * 
     * @return
     *     The connectionCount
     */
    public Long getConnectionCount() {
        return connectionCount;
    }

    /**
     * 
     * @param connectionCount
     *     The connection_count
     */
    public void setConnectionCount(Long connectionCount) {
        this.connectionCount = connectionCount;
    }

    /**
     * 
     * @return
     *     The commonConnections
     */
    public List<Object> getCommonConnections() {
        return commonConnections;
    }

    /**
     * 
     * @param commonConnections
     *     The common_connections
     */
    public void setCommonConnections(List<Object> commonConnections) {
        this.commonConnections = commonConnections;
    }

    /**
     * 
     * @return
     *     The interestCount
     */
    public Long getInterestCount() {
        return interestCount;
    }

    /**
     * 
     * @param interestCount
     *     The interest_count
     */
    public void setInterestCount(Long interestCount) {
        this.interestCount = interestCount;
    }

    /**
     * 
     * @return
     *     The commonInterests
     */
    public List<Object> getCommonInterests() {
        return commonInterests;
    }

    /**
     * 
     * @param commonInterests
     *     The common_interests
     */
    public void setCommonInterests(List<Object> commonInterests) {
        this.commonInterests = commonInterests;
    }

    /**
     * 
     * @return
     *     The distanceMi
     */
    public Long getDistanceMi() {
        return distanceMi;
    }

    /**
     * 
     * @param distanceMi
     *     The distance_mi
     */
    public void setDistanceMi(Long distanceMi) {
        this.distanceMi = distanceMi;
    }

    /**
     * 
     * @return
     *     The gender
     */
    public Long getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    public void setGender(Long gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The photos
     */
    public List<Photo> getPhotos() {
        return photos;
    }

    /**
     * 
     * @param photos
     *     The photos
     */
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    /**
     * 
     * @return
     *     The pingTime
     */
    public String getPingTime() {
        return pingTime;
    }

    /**
     * 
     * @param pingTime
     *     The ping_time
     */
    public void setPingTime(String pingTime) {
        this.pingTime = pingTime;
    }

    /**
     * 
     * @return
     *     The teaser
     */
    public Teaser getTeaser() {
        return teaser;
    }

    /**
     * 
     * @param teaser
     *     The teaser
     */
    public void setTeaser(Teaser teaser) {
        this.teaser = teaser;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

}
