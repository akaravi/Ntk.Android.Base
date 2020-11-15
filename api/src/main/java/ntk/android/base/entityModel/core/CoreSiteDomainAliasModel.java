package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteDomainAliasModel extends BaseEntity<Long> {
    public @SerializedName("CmsSite")
    CoreSiteModel CmsSite;
    public @SerializedName("SubDomain")
    String DubDomain;
    public @SerializedName("Domain")
    String Domain;
    public @SerializedName("Redirect")
    String Redirect;
    public @SerializedName("LinkCmsSiteId")
    Long LinkCmsSiteId;
    public @SerializedName("Virtual_CmsSite")
    CoreSiteModel Virtual_CmsSite;
}
