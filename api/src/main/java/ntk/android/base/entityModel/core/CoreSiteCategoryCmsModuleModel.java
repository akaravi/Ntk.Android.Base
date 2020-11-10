package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteCategoryCmsModuleModel extends BaseEntity<Long> {

    @SerializedName("linkCmsSiteCategoryId")
    public long linkCmsSiteCategoryId;

    @SerializedName("virtual_CmsSiteCategory")
    public CoreSiteCategoryModel virtual_CmsSiteCategory;
    @SerializedName("cmsSiteCategory")
    public CoreSiteCategoryModel cmsSiteCategory;
    @SerializedName("linkCmsModuleId")
    public Long linkCmsModuleId;

    @SerializedName("virtual_CmsModule")
    public CoreModuleModel virtual_CmsModule;
    @SerializedName("cmsModule")
    public CoreModuleModel cmsModule;
    @SerializedName("configValuesJson")
    public String configValuesJson;
}
