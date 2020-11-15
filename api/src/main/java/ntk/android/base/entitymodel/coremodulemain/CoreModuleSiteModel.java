package ntk.android.base.entitymodel.coremodulemain;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.core.CoreModuleModel;
import ntk.android.base.entitymodel.core.CoreSiteModel;

public class CoreModuleSiteModel extends BaseEntity<Long> {
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("LinkSiteId")
    public long LinkSiteId;
    @SerializedName("Title")
    public String Title;
    @SerializedName("LinkModuleId")
    public long LinkModuleId;
    @SerializedName("ReNewDate")
    public String ReNewDate;
    @SerializedName("HasBuyed")
    public boolean HasBuyed;
    @SerializedName(" virtual_CmsSite")
    public CoreSiteModel  virtual_CmsSite;
    @SerializedName("CmsSite")
    public CoreSiteModel CmsSite;
    @SerializedName(" virtual_CmsModule")
    public CoreModuleModel  virtual_CmsModule;
    @SerializedName("CmsModule")
    public CoreModuleModel CmsModule;
    @SerializedName("ModuleConfigSiteAccessValuesJson")
    public String ModuleConfigSiteAccessValuesJson;
    @SerializedName("ModuleConfigSiteValuesJson")
    public String ModuleConfigSiteValuesJson;
    @SerializedName("ModuleSiteStorageValuesJson")
    public String ModuleSiteStorageValuesJson;
}
