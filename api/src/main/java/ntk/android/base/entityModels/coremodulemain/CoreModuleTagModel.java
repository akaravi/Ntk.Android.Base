package ntk.android.base.entitymodel.coremodulemain;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class CoreModuleTagModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("LinkCategoryId")
    public String LinkCategoryId;
    @SerializedName("Category")
    public CoreModuleTagCategoryModel Category;

}
