package ntk.base.api.musicGallery.entity;

import com.google.gson.annotations.SerializedName;

public class MusicGalleryTag {

    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkCategoryTagId")
    public String LinkCategoryTagId;
}
