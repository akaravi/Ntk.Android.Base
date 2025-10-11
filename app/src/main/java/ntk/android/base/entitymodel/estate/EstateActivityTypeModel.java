package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstateActivityTypeModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("TitleML")
    public String TitleML;
    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;
    @SerializedName("Description")
    public String Description;
    @SerializedName("IconFont")
    public String IconFont;
    @SerializedName("IconColor")
    public String IconColor;
    @SerializedName("")
    public long LinkMainImageId;
}
