package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteDomainAliasModel extends BaseEntity<Long> {
    public @SerializedName("CmsSite")
    CoreSiteModel CmsSite;
    public @SerializedName("subDomain")
    String subDomain;
    public @SerializedName("domain")
    String domain;
    public @SerializedName("redirect")
    String redirect;
    public @SerializedName("linkCmsSiteId")
    Long linkCmsSiteId;
    public @SerializedName("virtual_CmsSite")
    CoreSiteModel virtual_CmsSite;
}
