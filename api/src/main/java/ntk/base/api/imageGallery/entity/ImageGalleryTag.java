package ntk.base.api.imageGallery.entity;

import com.google.gson.annotations.SerializedName;

public class ImageGalleryTag {

    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkCategoryTagId")
    public String LinkCategoryTagId;
}
