package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteDomainAliasModel extends BaseEntity<Long> {
    public @SerializedName("")
    CoreSiteModel CmsSite;
    public @SerializedName("")
    String subDomain;
    public @SerializedName("")
    String domain;
    public @SerializedName("")
    String redirect;
    public @SerializedName("")
    Long linkCmsSiteId;
    public @SerializedName("")
    CoreSiteModel virtual_CmsSite;
}
