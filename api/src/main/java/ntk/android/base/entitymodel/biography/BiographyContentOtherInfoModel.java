package ntk.android.base.entitymodel.biography;

import com.google.gson.annotations.SerializedName;

public class BiographyContentOtherInfoModel {
    @SerializedName("Title")
    public String Title;
    @SerializedName("HtmlBody")
    public String HtmlBody;
    @SerializedName("Source")
    public String Source;
    @SerializedName("LinkContentId")
    public long LinkContentId;
    @SerializedName("TypeId")
    public Long TypeId;
    @SerializedName("virtual_Content")
    public BiographyContentModel virtual_Content;
    @SerializedName("Content")
    public BiographyContentModel Content;
}
