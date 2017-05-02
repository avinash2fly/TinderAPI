package com.avinash.java.hacks.tinder.pojos.nearby_users;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Result {

    @SerializedName("distance_mi")
    private Integer distanceMi;
    @SerializedName("connection_count")
    private Integer connectionCount;
    @SerializedName("common_like_count")
    private Integer commonLikeCount;
    @SerializedName("common_friend_count")
    private Integer commonFriendCount;
    @SerializedName("common_likes")
    private List<Object> commonLikes = new ArrayList<Object>();
    @SerializedName("common_friends")
    private List<Object> commonFriends = new ArrayList<Object>();
    @SerializedName("_id")
    private String Id;
    @SerializedName("bio")
    private String bio;
    @SerializedName("birth_date")
    private String birthDate;
    @SerializedName("gender")
    private Integer gender;
    @SerializedName("name")
    private String name;
    @SerializedName("ping_time")
    private String pingTime;
    @SerializedName("photos")
    private Photo[] photos;
    @SerializedName("jobs")
    private Object[] jobs;
    @SerializedName("schools")
    private Object[] schools;
    @SerializedName("teaser")
    private Teaser teaser;
    @SerializedName("birth_date_info")
    private String birthDateInfo;

    public Integer getDistanceMi() {
        return distanceMi;
    }

    public void setDistanceMi(Integer distanceMi) {
        this.distanceMi = distanceMi;
    }

    public Integer getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    public Integer getCommonLikeCount() {
        return commonLikeCount;
    }

    public void setCommonLikeCount(Integer commonLikeCount) {
        this.commonLikeCount = commonLikeCount;
    }

    public Integer getCommonFriendCount() {
        return commonFriendCount;
    }

    public void setCommonFriendCount(Integer commonFriendCount) {
        this.commonFriendCount = commonFriendCount;
    }

    public List<Object> getCommonLikes() {
        return commonLikes;
    }

    public void setCommonLikes(List<Object> commonLikes) {
        this.commonLikes = commonLikes;
    }

    public List<Object> getCommonFriends() {
        return commonFriends;
    }

    public void setCommonFriends(List<Object> commonFriends) {
        this.commonFriends = commonFriends;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPingTime() {
        return pingTime;
    }

    public void setPingTime(String pingTime) {
        this.pingTime = pingTime;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public Object[] getJobs() {
        return jobs;
    }

    public void setJobs(Object[] jobs) {
        this.jobs = jobs;
    }

    public Object[] getSchools() {
        return schools;
    }

    public void setSchools(Object[] schools) {
        this.schools = schools;
    }

    public Teaser getTeaser() {
        return teaser;
    }

    public void setTeaser(Teaser teaser) {
        this.teaser = teaser;
    }

    public String getBirthDateInfo() {
        return birthDateInfo;
    }

    public void setBirthDateInfo(String birthDateInfo) {
        this.birthDateInfo = birthDateInfo;
    }
}
