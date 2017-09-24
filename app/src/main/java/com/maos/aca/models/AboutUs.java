package com.maos.aca.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AboutUs {

    @SerializedName("category")
    @Expose
    private String heading;

    @SerializedName("data")
    @Expose
    private List<AboutUsMenu> about_us_menu_list;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<AboutUsMenu> getAbout_us_menu_list() {
        return about_us_menu_list;
    }

    public void setAbout_us_menu_list(List<AboutUsMenu> about_us_menu_list) {
        this.about_us_menu_list = about_us_menu_list;
    }
}
