
package com.avinash.java.hacks.tinder.pojos.update_distance_response;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class UpdateDistanceResponse {

    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("active_time")
    @Expose
    private String activeTime;
    @SerializedName("age_filter_max")
    @Expose
    private Long ageFilterMax;
    @SerializedName("age_filter_min")
    @Expose
    private Long ageFilterMin;
    @SerializedName("api_token")
    @Expose
    private String apiToken;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("blend")
    @Expose
    private String blend;
    @SerializedName("college")
    @Expose
    private List<String> college = new ArrayList<String>();
    @SerializedName("connection_count")
    @Expose
    private Long connectionCount;
    @SerializedName("create_date")
    @Expose
    private String createDate;
    @SerializedName("discoverable")
    @Expose
    private Boolean discoverable;
    @SerializedName("distance_filter")
    @Expose
    private Long distanceFilter;
    @SerializedName("distance_filter_min")
    @Expose
    private Long distanceFilterMin;
    @SerializedName("friends")
    @Expose
    private List<String> friends = new ArrayList<String>();
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("gender")
    @Expose
    private Long gender;
    @SerializedName("gender_filter")
    @Expose
    private Long genderFilter;
    @SerializedName("groups")
    @Expose
    private List<Object> groups = new ArrayList<Object>();
    @SerializedName("high_school")
    @Expose
    private List<String> highSchool = new ArrayList<String>();
    @SerializedName("interested_in")
    @Expose
    private List<Long> interestedIn = new ArrayList<Long>();
    @SerializedName("interests")
    @Expose
    private List<Interest> interests = new ArrayList<Interest>();
    @SerializedName("jobs")
    @Expose
    private List<Job> jobs = new ArrayList<Job>();
    @SerializedName("latest_update_date")
    @Expose
    private String latestUpdateDate;
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
    @SerializedName("pos_major")
    @Expose
    private PosMajor posMajor;
    @SerializedName("promoted_out_of_date")
    @Expose
    private Boolean promotedOutOfDate;
    @SerializedName("schools")
    @Expose
    private List<School> schools = new ArrayList<School>();
    @SerializedName("username")
    @Expose
    private String username;

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
     *     The activeTime
     */
    public String getActiveTime() {
        return activeTime;
    }

    /**
     * 
     * @param activeTime
     *     The active_time
     */
    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    /**
     * 
     * @return
     *     The ageFilterMax
     */
    public Long getAgeFilterMax() {
        return ageFilterMax;
    }

    /**
     * 
     * @param ageFilterMax
     *     The age_filter_max
     */
    public void setAgeFilterMax(Long ageFilterMax) {
        this.ageFilterMax = ageFilterMax;
    }

    /**
     * 
     * @return
     *     The ageFilterMin
     */
    public Long getAgeFilterMin() {
        return ageFilterMin;
    }

    /**
     * 
     * @param ageFilterMin
     *     The age_filter_min
     */
    public void setAgeFilterMin(Long ageFilterMin) {
        this.ageFilterMin = ageFilterMin;
    }

    /**
     * 
     * @return
     *     The apiToken
     */
    public String getApiToken() {
        return apiToken;
    }

    /**
     * 
     * @param apiToken
     *     The api_token
     */
    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
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
     *     The blend
     */
    public String getBlend() {
        return blend;
    }

    /**
     * 
     * @param blend
     *     The blend
     */
    public void setBlend(String blend) {
        this.blend = blend;
    }

    /**
     * 
     * @return
     *     The college
     */
    public List<String> getCollege() {
        return college;
    }

    /**
     * 
     * @param college
     *     The college
     */
    public void setCollege(List<String> college) {
        this.college = college;
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
     *     The createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 
     * @param createDate
     *     The create_date
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * 
     * @return
     *     The discoverable
     */
    public Boolean getDiscoverable() {
        return discoverable;
    }

    /**
     * 
     * @param discoverable
     *     The discoverable
     */
    public void setDiscoverable(Boolean discoverable) {
        this.discoverable = discoverable;
    }

    /**
     * 
     * @return
     *     The distanceFilter
     */
    public Long getDistanceFilter() {
        return distanceFilter;
    }

    /**
     * 
     * @param distanceFilter
     *     The distance_filter
     */
    public void setDistanceFilter(Long distanceFilter) {
        this.distanceFilter = distanceFilter;
    }

    /**
     * 
     * @return
     *     The distanceFilterMin
     */
    public Long getDistanceFilterMin() {
        return distanceFilterMin;
    }

    /**
     * 
     * @param distanceFilterMin
     *     The distance_filter_min
     */
    public void setDistanceFilterMin(Long distanceFilterMin) {
        this.distanceFilterMin = distanceFilterMin;
    }

    /**
     * 
     * @return
     *     The friends
     */
    public List<String> getFriends() {
        return friends;
    }

    /**
     * 
     * @param friends
     *     The friends
     */
    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    /**
     * 
     * @return
     *     The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
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
     *     The genderFilter
     */
    public Long getGenderFilter() {
        return genderFilter;
    }

    /**
     * 
     * @param genderFilter
     *     The gender_filter
     */
    public void setGenderFilter(Long genderFilter) {
        this.genderFilter = genderFilter;
    }

    /**
     * 
     * @return
     *     The groups
     */
    public List<Object> getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    /**
     * 
     * @return
     *     The highSchool
     */
    public List<String> getHighSchool() {
        return highSchool;
    }

    /**
     * 
     * @param highSchool
     *     The high_school
     */
    public void setHighSchool(List<String> highSchool) {
        this.highSchool = highSchool;
    }

    /**
     * 
     * @return
     *     The interestedIn
     */
    public List<Long> getInterestedIn() {
        return interestedIn;
    }

    /**
     * 
     * @param interestedIn
     *     The interested_in
     */
    public void setInterestedIn(List<Long> interestedIn) {
        this.interestedIn = interestedIn;
    }

    /**
     * 
     * @return
     *     The interests
     */
    public List<Interest> getInterests() {
        return interests;
    }

    /**
     * 
     * @param interests
     *     The interests
     */
    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    /**
     * 
     * @return
     *     The jobs
     */
    public List<Job> getJobs() {
        return jobs;
    }

    /**
     * 
     * @param jobs
     *     The jobs
     */
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    /**
     * 
     * @return
     *     The latestUpdateDate
     */
    public String getLatestUpdateDate() {
        return latestUpdateDate;
    }

    /**
     * 
     * @param latestUpdateDate
     *     The latest_update_date
     */
    public void setLatestUpdateDate(String latestUpdateDate) {
        this.latestUpdateDate = latestUpdateDate;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
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
     *     The pos
     */
    public Pos getPos() {
        return pos;
    }

    /**
     * 
     * @param pos
     *     The pos
     */
    public void setPos(Pos pos) {
        this.pos = pos;
    }

    /**
     * 
     * @return
     *     The posMajor
     */
    public PosMajor getPosMajor() {
        return posMajor;
    }

    /**
     * 
     * @param posMajor
     *     The pos_major
     */
    public void setPosMajor(PosMajor posMajor) {
        this.posMajor = posMajor;
    }

    /**
     * 
     * @return
     *     The promotedOutOfDate
     */
    public Boolean getPromotedOutOfDate() {
        return promotedOutOfDate;
    }

    /**
     * 
     * @param promotedOutOfDate
     *     The promoted_out_of_date
     */
    public void setPromotedOutOfDate(Boolean promotedOutOfDate) {
        this.promotedOutOfDate = promotedOutOfDate;
    }

    /**
     * 
     * @return
     *     The schools
     */
    public List<School> getSchools() {
        return schools;
    }

    /**
     * 
     * @param schools
     *     The schools
     */
    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

}
