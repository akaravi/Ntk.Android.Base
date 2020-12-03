package ntk.android.base.entitymodel.biography;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BiographyCategoryModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;
    @SerializedName("Description")
    public String Description;
    @SerializedName("FontIcon")
    public String FontIcon;
    @SerializedName("LinkParentIdNode")
    public String LinkParentIdNode;
    @SerializedName("LinkParentId")
    public long LinkParentId;
    @SerializedName("Children")
    public List<BiographyCategoryModel> Children;
    @SerializedName("Category")
    public BiographyCategoryModel Category;
    @SerializedName("virtual_Category")
    public BiographyCategoryModel virtual_Category;
    @SerializedName("Contents")
    public List<BiographyContentModel> Contents;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
}
