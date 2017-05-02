
package com.freakynit.java.hacks.tinder.pojos.update_distance_response;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Job {

    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("title")
    @Expose
    private Title title;

    /**
     * 
     * @return
     *     The company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * 
     * @return
     *     The title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

}
