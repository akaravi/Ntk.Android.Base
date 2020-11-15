package ntk.android.base.entitymodel.coremodulemain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class CoreModuleTagCategoryModel extends BaseModuleEntity<Long> {
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
    @SerializedName("Category")
    public CoreModuleTagCategoryModel Category;

    @SerializedName("Virtual_Category")
    public CoreModuleTagCategoryModel Virtual_Category;
    @SerializedName("Children")
    public List<CoreModuleTagCategoryModel> Children;
    @SerializedName("Tags")
    public List<CoreModuleTagModel> Tags;

}
