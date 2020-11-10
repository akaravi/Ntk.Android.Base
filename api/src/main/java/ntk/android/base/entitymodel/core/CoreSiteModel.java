package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.coremodulemain.CoreModuleSiteModel;
import ntk.android.base.entitymodel.enums.EnumSiteStatus;

public class CoreSiteModel {
    public @SerializedName("CurrentSiteDomainUrl")
    String CurrentSiteDomainUrl;
    public @SerializedName("MainImageSrc")
    String MainImageSrc;

    public @SerializedName("expireDate")
    String expireDate;
    public @SerializedName("linkCreatedBySiteId")
    Long linkCreatedBySiteId;
    // tslint:disable-next-line: variable-name
    public @SerializedName("virtual_ParentCreator")
    CoreSiteModel virtual_ParentCreator;
    public @SerializedName("parentCreator")
    CoreSiteModel parentCreator;
    public @SerializedName("Title")
    String Title;
    public @SerializedName("ownerSiteSetStatus")
    EnumSiteStatus ownerSiteSetStatus;
    public @SerializedName("userLanguage")
    int userLanguage;
    public @SerializedName("subDomain")
    String subDomain;
    public @SerializedName("domain")
    String domain;
    public @SerializedName("redirect")
    String redirect;
    public @SerializedName("keyword")
    String keyword;
    public @SerializedName("description")
    String description;
    public @SerializedName("linkFavIconId")
    Long linkFavIconId;
    public @SerializedName("linkSiteCategoryId")
    long linkSiteCategoryId;

    public @SerializedName("virtual_CmsSiteCategory")
    CoreSiteCategoryModel virtual_CmsSiteCategory;
    public @SerializedName("cmsSiteCategory")
    CoreSiteCategoryModel cmsSiteCategory;
    public @SerializedName("hasAccountingForm")
    boolean hasAccountingForm;
    public @SerializedName("viewInCmsSiteLIst")
    boolean viewInCmsSiteLIst;
    public @SerializedName("accountingFormNo")
    long accountingFormNo;
    public @SerializedName("accountingFormCreatedDate")
    String accountingFormCreatedDate;
    public @SerializedName("accountingFormUpdatedDate")
    String accountingFormUpdatedDate;
    public @SerializedName("siteUsers")
    List<CoreSiteUserModel> siteUsers;
    public @SerializedName("moduleSites")
    List<CoreModuleSiteModel> moduleSites;
    public @SerializedName("domainAliases")
    List<CoreSiteDomainAliasModel> domainAliases;
    public @SerializedName("childernCreateds")
    List<CoreSiteModel> childernCreateds;
    public @SerializedName("devices")
    List<CoreDeviceModel> devices;
    public @SerializedName("copyright")
    String copyright;
    public @SerializedName("webMasterEmail")
    String webMasterEmail;
    public @SerializedName("webEditorEmail")
    String webEditorEmail;
}
