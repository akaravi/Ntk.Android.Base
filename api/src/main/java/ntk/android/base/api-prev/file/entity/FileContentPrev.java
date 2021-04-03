package ntk.android.base.api.file.entity;


import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class FileContentPrev extends BaseEntityPrev {


    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkCategoryId")
    public Long linkCategoryId;

    @SerializedName("virtual_Category")
    public FileCategoryPrev virtualCategory;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String description;


    @SerializedName("Favorited")
    public boolean Favorited;

    @SerializedName("ViewCount")
    public int viewCount;

    public boolean isFavorite;

    @SerializedName("ScoreSumPercent")
    public int ScoreSumPercent;

    @SerializedName("ScoreClick")
    public int ScoreSumClick;


    @SerializedName("Geolocationlatitude")
    public Double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;

}