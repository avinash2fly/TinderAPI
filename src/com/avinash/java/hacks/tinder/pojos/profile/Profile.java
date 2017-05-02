
package com.avinash.java.hacks.tinder.pojos.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Profile {

    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("age_filter_max")
    @Expose
    private Integer ageFilterMax;
    @SerializedName("age_filter_min")
    @Expose
    private Integer ageFilterMin;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("blend")
    @Expose
    private String blend;
    @SerializedName("create_date")
    @Expose
    private String createDate;
    @SerializedName("discoverable")
    @Expose
    private Boolean discoverable;
    @SerializedName("distance_filter")
    @Expose
    private Integer distanceFilter;
    @SerializedName("facebook_id")
    @Expose
    private String facebookId;
    @SerializedName("gender")
    @Expose
    private Integer gender;
    @SerializedName("gender_filter")
    @Expose
    private Integer genderFilter;
    @SerializedName("interested_in")
    @Expose
    private List<Integer> interestedIn = new ArrayList<Integer>();
    @SerializedName("jobs")
    @Expose
    private List<Job> jobs = new ArrayList<Job>();
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = new ArrayList<Photo>();
    @SerializedName("ping_time")
    @Expose
    private String pingTime;
    @SerializedName("pos")
    @Expose
    private Pos pos;
    @SerializedName("pos_info")
    @Expose
    private PosInfo posInfo;
    @SerializedName("schools")
    @Expose
    private List<School> schools = new ArrayList<School>();
    @SerializedName("username")
    @Expose
    private String username;
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public Integer getAgeFilterMax() {
        return ageFilterMax;
    }
    public void setAgeFilterMax(Integer ageFilterMax) {
        this.ageFilterMax = ageFilterMax;
    }
    public Integer getAgeFilterMin() {
        return ageFilterMin;
    }
    public void setAgeFilterMin(Integer ageFilterMin) {
        this.ageFilterMin = ageFilterMin;
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
    public String getBlend() {
        return blend;
    }
    public void setBlend(String blend) {
        this.blend = blend;
    }
    public String getCreateDate() {
        return createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public Boolean getDiscoverable() {
        return discoverable;
    }
    public void setDiscoverable(Boolean discoverable) {
        this.discoverable = discoverable;
    }
    public Integer getDistanceFilter() {
        return distanceFilter;
    }
    public void setDistanceFilter(Integer distanceFilter) {
        this.distanceFilter = distanceFilter;
    }
    public String getFacebookId() {
        return facebookId;
    }
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }
    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public Integer getGenderFilter() {
        return genderFilter;
    }
    public void setGenderFilter(Integer genderFilter) {
        this.genderFilter = genderFilter;
    }
    public List<Integer> getInterestedIn() {
        return interestedIn;
    }
    public void setInterestedIn(List<Integer> interestedIn) {
        this.interestedIn = interestedIn;
    }
    public List<Job> getJobs() {
        return jobs;
    }
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Photo> getPhotos() {
        return photos;
    }
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
    public String getPingTime() {
        return pingTime;
    }
    public void setPingTime(String pingTime) {
        this.pingTime = pingTime;
    }
    public Pos getPos() {
        return pos;
    }
    public void setPos(Pos pos) {
        this.pos = pos;
    }
    public PosInfo getPosInfo() {
        return posInfo;
    }
    public void setPosInfo(PosInfo posInfo) {
        this.posInfo = posInfo;
    }
    public List<School> getSchools() {
        return schools;
    }
    public void setSchools(List<School> schools) {
        this.schools = schools;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
