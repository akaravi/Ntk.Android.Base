package ntk.base.api.file.entity;


import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class FileContent  extends BaseEntity {


    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkCategoryId")
    public Long linkCategoryId;

    @SerializedName("virtual_Category")
    public FileCategory virtualCategory;

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
    public double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public double Geolocationlongitude;

}