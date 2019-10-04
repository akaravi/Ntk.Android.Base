package ntk.base.api.musicGallery.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class MusicGalleryContentOtherInfo extends BaseEntity {

    @SerializedName("Title")
    public String Title;

    @SerializedName("HtmlBody")
    public String HtmlBody;

    @SerializedName("Source")
    public String Source;

    @SerializedName("TypeId")
    public int TypeId;
}