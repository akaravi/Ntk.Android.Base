package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteCategoryCmsModuleModel extends BaseEntity<Long> {

    @SerializedName("LinkCmsSiteCategoryId")
    public long LinkCmsSiteCategoryId;

    @SerializedName("Virtual_CmsSiteCategory")
    public CoreSiteCategoryModel Virtual_CmsSiteCategory;
    @SerializedName("CmsSiteCategory")
    public CoreSiteCategoryModel CmsSiteCategory;
    @SerializedName("LinkCmsModuleId")
    public Long LinkCmsModuleId;

    @SerializedName("Virtual_CmsModule")
    public CoreModuleModel Virtual_CmsModule;
    @SerializedName("CmsModule")
    public CoreModuleModel CmsModule;
    @SerializedName("ConfigValuesJson")
    public String ConfigValuesJson;
}
