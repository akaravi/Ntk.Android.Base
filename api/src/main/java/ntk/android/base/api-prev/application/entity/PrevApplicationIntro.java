package ntk.android.base.api.application.entity;

import com.google.gson.annotations.SerializedName;

public class PrevApplicationIntro {

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description;

    @SerializedName("Priority")
    public int Priority;

    @SerializedName("LinkMainImageId")
    public String LinkMainImageId;

    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;

}
