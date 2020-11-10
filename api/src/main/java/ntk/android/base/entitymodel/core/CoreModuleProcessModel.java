package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoreModuleProcessModel {
    @SerializedName("TitleML")
    public String TitleML;
    @SerializedName("Title")
    public String Title;
    @SerializedName("titleResourceLanguage")
    public String titleResourceLanguage;
    @SerializedName("titleEn")
    public String titleEn;
    @SerializedName("processName")
    public String processName;
    @SerializedName("description")
    public String description;
    @SerializedName("linkModuleId")
    public Long linkModuleId;
    @SerializedName("virtual_CmsModule")
    public CoreModuleModel virtual_CmsModule;
    @SerializedName("cmsModule")
    public CoreModuleModel cmsModule;
    @SerializedName("cmsModuleProcessCustomize")
    public List<CoreModuleProcessCustomizeModel> cmsModuleProcessCustomize;
}
