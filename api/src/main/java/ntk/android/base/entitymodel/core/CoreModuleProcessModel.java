package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoreModuleProcessModel {
    @SerializedName("TitleML")
    public String TitleML;
    @SerializedName("Title")
    public String Title;
    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;
    @SerializedName("TitleEn")
    public String TitleEn;
    @SerializedName("ProcessName")
    public String ProcessName;
    @SerializedName("Description")
    public String Description;
    @SerializedName("LinkModuleId")
    public Long LinkModuleId;
    @SerializedName(" virtual_CmsModule")
    public CoreModuleModel  virtual_CmsModule;
    @SerializedName("CmsModule")
    public CoreModuleModel CmsModule;
    @SerializedName("CmsModuleProcessCustomize")
    public List<CoreModuleProcessCustomizeModel> CmsModuleProcessCustomize;
}
