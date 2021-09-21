package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreSiteDomainAliasModel extends BaseEntity<Long> {
    @SerializedName("CmsSite")
    public    CoreSiteModel CmsSite;
    @SerializedName("SubDomain")
    public   String DubDomain;
    @SerializedName("Domain")
    public  String Domain;
    @SerializedName("Redirect")
    public  String Redirect;
    @SerializedName("LinkCmsSiteId")
    public Long LinkCmsSiteId;
    @SerializedName(" virtual_CmsSite")
    public  CoreSiteModel  virtual_CmsSite;
}
