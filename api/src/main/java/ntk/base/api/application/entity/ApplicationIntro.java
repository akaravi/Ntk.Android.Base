package ntk.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

public class ApplicationIntro {

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description;

    @SerializedName("Priority")
    public int Priority;

    @SerializedName("LinkMainImageId")
    public String LinkMainImageId;

    @SerializedName("MainImageSrc")
    public String MainImageSrc;

}
