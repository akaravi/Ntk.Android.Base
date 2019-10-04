package ntk.base.api.movieGallery.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieGalleryCategoryTag {

    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("MainImageSrc")
    public String imageSrc;

    @SerializedName("LinkMainImageId")
    public String LinkMainImageId;

    @SerializedName("LinkMainImageSrc")
    public String LinkMainImageSrc;

    @SerializedName("Children")
    public List<MovieGalleryCategoryTag> Children;
}