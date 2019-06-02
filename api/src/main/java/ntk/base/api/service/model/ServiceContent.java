package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.BaseEntity;

public class ServiceContent extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("MainImageSrc")
    public String imageSrc;

    @SerializedName("LinkCategoryId")
    public Long linkCategoryId;

    @SerializedName("virtual_Category")
    public ServiceCategory virtualCategory;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String description;

    @SerializedName("Body")
    public String Body;

    @SerializedName("Favorited")
    public Boolean Favorited;

    @SerializedName("ViewCount")
    public int viewCount;

    @SerializedName("Source")
    public String Source;

    @SerializedName("ScoreSumPercent")
    public int ScoreSumPercent;

    @SerializedName("ScoreClick")
    public int ScoreSumClick;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;

    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;

    @SerializedName("LinkFileMovieIdSrc")
    public String LinkFileMovieIdSrc;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("LinkFilePodcastId")
    public long LinkFilePodcastId;

    @SerializedName("LinkFileMovieId")
    public long LinkFileMovieId;

    @SerializedName("Geolocationlatitude")
    public double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public double Geolocationlongitude;


}
