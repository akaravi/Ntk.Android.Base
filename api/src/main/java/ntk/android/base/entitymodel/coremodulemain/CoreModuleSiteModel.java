package ntk.android.base.entitymodel.coremodulemain;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.core.CoreModuleModel;
import ntk.android.base.entitymodel.core.CoreSiteModel;

public class CoreModuleSiteModel extends BaseEntity<Long> {
    @SerializedName("")
    public String expireDate;
    @SerializedName("")
    public long LinkSiteId;
    @SerializedName("")
    public String Title;
    @SerializedName("")
    public long linkModuleId;
    @SerializedName("")
    public String renewDate;
    @SerializedName("")
    public boolean hasBuyed;
    @SerializedName("")
    public CoreSiteModel virtual_CmsSite;
    @SerializedName("")
    public CoreSiteModel cmsSite;
    @SerializedName("")
    public CoreModuleModel virtual_CmsModule;
    @SerializedName("")
    public CoreModuleModel cmsModule;
    @SerializedName("")
    public String moduleConfigSiteAccessValuesJson;
    @SerializedName("")
    public String moduleConfigSiteValuesJson;
    @SerializedName("")
    public String moduleSiteStorageValuesJson;
}
