package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyTypeUsageModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description;
    @SerializedName("IconFont")
    public String IconFont;
    @SerializedName("IconColor")
    public String IconColor;
    @SerializedName("LinkMainImageId")
    public int LinkMainImageId;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
    @SerializedName("PropertyTypes")
    public List<EstatePropertyTypeModel> PropertyTypes;
}
