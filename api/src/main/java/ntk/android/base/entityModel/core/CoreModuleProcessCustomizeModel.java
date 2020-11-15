package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreModuleProcessCustomizeModel extends BaseEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("TitleEn")
    public String TitleEn;
    @SerializedName("Description")
    public String Description;
    @SerializedName("LinkModuleProcessId")
    public Long LinkModuleProcessId;

    @SerializedName("Virtual_CmsModuleProcess")
    public CoreModuleProcessModel Virtual_CmsModuleProcess;
    @SerializedName("CmsModuleProcess")
    public CoreModuleProcessModel CmsModuleProcess;
    @SerializedName("ProcessInputCustomizeValue")
    public String ProcessInputCustomizeValue;
    @SerializedName("ProcessInputValueForm")
    public String ProcessInputValueForm;
    @SerializedName("LinkProcessCustomizeDependenceBeforRunId")
    public Long LinkProcessCustomizeDependenceBeforRunId;
}

