package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.coremain.CoreModuleSiteModel;
import ntk.android.base.entitymodel.enums.EnumSiteStatus;

public class CoreSiteModel {
    public @SerializedName("CurrentSiteDomainUrl")
    String CurrentSiteDomainUrl;
    public @SerializedName("LinkMainImageIdSrc")
    String LinkMainImageIdSrc;

    public @SerializedName("ExpireDate")
    String ExpireDate;
    public @SerializedName("LinkCreatedBySiteId")
    Long LinkCreatedBySiteId;
    // tslint:disable-next-line: variable-name
    public @SerializedName(" virtual_ParentCreator")
    CoreSiteModel  virtual_ParentCreator;
    public @SerializedName("ParentCreator")
    CoreSiteModel ParentCreator;
    public @SerializedName("Title")
    String Title;
    public @SerializedName("OwnerSiteSetStatus")
    EnumSiteStatus OwnerSiteSetStatus;
    public @SerializedName("UserLanguage")
    int UserLanguage;
    public @SerializedName("SubDomain")
    String SubDomain;
    public @SerializedName("Domain")
    String Domain;
    public @SerializedName("Redirect")
    String Redirect;
    public @SerializedName("Keyword")
    String Keyword;
    public @SerializedName("Description")
    String Description;
    public @SerializedName("LinkFavIconId")
    Long LinkFavIconId;
    public @SerializedName("LinkSiteCategoryId")
    long LinkSiteCategoryId;

    public @SerializedName(" virtual_CmsSiteCategory")
    CoreSiteCategoryModel  virtual_CmsSiteCategory;
    public @SerializedName("CmsSiteCategory")
    CoreSiteCategoryModel CmsSiteCategory;
    public @SerializedName("HasAccountingForm")
    boolean HasAccountingForm;
    public @SerializedName("ViewInCmsSiteLIst")
    boolean ViewInCmsSiteLIst;
    public @SerializedName("AccountingFormNo")
    long AccountingFormNo;
    public @SerializedName("AccountingFormCreatedDate")
    String AccountingFormCreatedDate;
    public @SerializedName("AccountingFormUpdatedDate")
    String AccountingFormUpdatedDate;
    public @SerializedName("SiteUsers")
    List<CoreSiteUserModel> SiteUsers;
    public @SerializedName("ModuleSites")
    List<CoreModuleSiteModel> ModuleSites;
    public @SerializedName("DomainAliases")
    List<CoreSiteDomainAliasModel> DomainAliases;
    public @SerializedName("ChildernCreateds")
    List<CoreSiteModel> ChildernCreateds;
    public @SerializedName("Devices")
    List<CoreDeviceModel> Devices;
    public @SerializedName("Copyright")
    String Copyright;
    public @SerializedName("WebMasterEmail")
    String WebMasterEmail;
    public @SerializedName("WebEditorEmail")
    String WebEditorEmail;
}
