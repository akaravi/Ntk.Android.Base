package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteCategoryCmsModuleModel extends BaseEntity<Long> {

    @SerializedName("LinkCmsSiteCategoryId")
    public long LinkCmsSiteCategoryId;

    @SerializedName(" virtual_CmsSiteCategory")
    public CoreSiteCategoryModel  virtual_CmsSiteCategory;
    @SerializedName("CmsSiteCategory")
    public CoreSiteCategoryModel CmsSiteCategory;
    @SerializedName("LinkCmsModuleId")
    public Long LinkCmsModuleId;

    @SerializedName(" virtual_CmsModule")
    public CoreModuleModel  virtual_CmsModule;
    @SerializedName("CmsModule")
    public CoreModuleModel CmsModule;
    @SerializedName("ConfigValuesJson")
    public String ConfigValuesJson;
}
