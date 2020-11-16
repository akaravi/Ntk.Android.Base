package ntk.android.base.api.blog.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntity;

public class BlogContent extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("MainImageSrc")
    public String imageSrc;

    @SerializedName("LinkCategoryId")
    public Long linkCategoryId;

    @SerializedName("virtual_Category")
    public BlogCategory virtualCategory;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String description;

    @SerializedName("Body")
    public String Body;

    @SerializedName("Source")
    public String Source;

    @SerializedName("Favorited")
    public Boolean Favorited;

    @SerializedName("ViewCount")
    public int viewCount;

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
    public Double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;
}
