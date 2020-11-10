package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreModuleProcessCustomizeModel extends BaseEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("titleEn")
    public String titleEn;
    @SerializedName("description")
    public String description;
    @SerializedName("linkModuleProcessId")
    public Long linkModuleProcessId;

    @SerializedName("virtual_CmsModuleProcess")
    public CoreModuleProcessModel virtual_CmsModuleProcess;
    @SerializedName("cmsModuleProcess")
    public CoreModuleProcessModel cmsModuleProcess;
    @SerializedName("processInputCustomizeValue")
    public String processInputCustomizeValue;
    @SerializedName("processInputValueForm")
    public String processInputValueForm;
    @SerializedName("linkProcessCustomizeDependenceBeforRunId")
    public Long linkProcessCustomizeDependenceBeforRunId;
}

