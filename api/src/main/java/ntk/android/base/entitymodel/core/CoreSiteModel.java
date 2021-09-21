package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.coremain.CoreModuleSiteModel;
import ntk.android.base.entitymodel.enums.EnumSiteStatus;

public class CoreSiteModel {
    @SerializedName("CurrentSiteDomainUrl")
    public String CurrentSiteDomainUrl;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;

    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("LinkCreatedBySiteId")
    public Long LinkCreatedBySiteId;
    // tslint:disable-next-line: variable-name
    @SerializedName(" virtual_ParentCreator")
    public CoreSiteModel virtual_ParentCreator;
    @SerializedName("ParentCreator")
    public CoreSiteModel ParentCreator;
    @SerializedName("Title")
    public String Title;
    @SerializedName("OwnerSiteSetStatus")
    public EnumSiteStatus OwnerSiteSetStatus;
    @SerializedName("UserLanguage")
    public int UserLanguage;
    @SerializedName("SubDomain")
    public String SubDomain;
    @SerializedName("Domain")
    public String Domain;
    @SerializedName("Redirect")
    public String Redirect;
    @SerializedName("Keyword")
    public String Keyword;
    @SerializedName("Description")
    public String Description;
    @SerializedName("LinkFavIconId")
    public Long LinkFavIconId;
    @SerializedName("LinkSiteCategoryId")
    public long LinkSiteCategoryId;

    @SerializedName(" virtual_CmsSiteCategory")
    public CoreSiteCategoryModel virtual_CmsSiteCategory;
     @SerializedName("CmsSiteCategory")
     public CoreSiteCategoryModel CmsSiteCategory;
    @SerializedName("HasAccountingForm")
    public boolean HasAccountingForm;
    @SerializedName("ViewInCmsSiteLIst")
    public boolean ViewInCmsSiteLIst;
    @SerializedName("AccountingFormNo")
    public long AccountingFormNo;
    @SerializedName("AccountingFormCreatedDate")
    public String AccountingFormCreatedDate;
    @SerializedName("AccountingFormUpdatedDate")
    public String AccountingFormUpdatedDate;
    @SerializedName("SiteUsers")
    public List<CoreSiteUserModel> SiteUsers;
    @SerializedName("ModuleSites")
    public List<CoreModuleSiteModel> ModuleSites;
    @SerializedName("DomainAliases")
    public List<CoreSiteDomainAliasModel> DomainAliases;
    @SerializedName("ChildernCreateds")
    public List<CoreSiteModel> ChildernCreateds;
    @SerializedName("Devices")
    public List<CoreDeviceModel> Devices;
    @SerializedName("Copyright")
    public String Copyright;
    @SerializedName("WebMasterEmail")
    public String WebMasterEmail;
    @SerializedName("WebEditorEmail")
    String WebEditorEmail;
}
