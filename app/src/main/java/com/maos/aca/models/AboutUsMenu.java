package com.maos.aca.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AboutUsMenu {

    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("caption")
    @Expose
    private String caption;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

}
