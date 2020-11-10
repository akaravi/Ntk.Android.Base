package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.coremodulemain.CoreModuleSiteModel;
import ntk.android.base.entitymodel.enums.EnumSiteStatus;

public class CoreSiteModel {
    public @SerializedName("")
    String CurrentSiteDomainUrl;
    public @SerializedName("")
    String MainImageSrc;

    public @SerializedName("")
    String expireDate;
    public @SerializedName("")
    Long linkCreatedBySiteId;
    // tslint:disable-next-line: variable-name
    public @SerializedName("")
    CoreSiteModel virtual_ParentCreator;
    public @SerializedName("")
    CoreSiteModel parentCreator;
    public @SerializedName("")
    String Title;
    public @SerializedName("")
    EnumSiteStatus ownerSiteSetStatus;
    public @SerializedName("")
    int userLanguage;
    public @SerializedName("")
    String subDomain;
    public @SerializedName("")
    String domain;
    public @SerializedName("")
    String redirect;
    public @SerializedName("")
    String keyword;
    public @SerializedName("")
    String description;
    public @SerializedName("")
    Long linkFavIconId;
    public @SerializedName("")
    long linkSiteCategoryId;

    public @SerializedName("")
    CoreSiteCategoryModel virtual_CmsSiteCategory;
    public @SerializedName("")
    CoreSiteCategoryModel cmsSiteCategory;
    public @SerializedName("")
    boolean hasAccountingForm;
    public @SerializedName("")
    boolean viewInCmsSiteLIst;
    public @SerializedName("")
    long accountingFormNo;
    public @SerializedName("")
    String accountingFormCreatedDate;
    public @SerializedName("")
    String accountingFormUpdatedDate;
    public @SerializedName("")
    List<CoreSiteUserModel> siteUsers;
    public @SerializedName("")
    List<CoreModuleSiteModel> moduleSites;
    public @SerializedName("")
    List<CoreSiteDomainAliasModel> domainAliases;
    public @SerializedName("")
    List<CoreSiteModel> childernCreateds;
    public @SerializedName("")
    List<CoreDeviceModel> devices;
    public @SerializedName("")
    String copyright;
    public @SerializedName("")
    String webMasterEmail;
    public @SerializedName("")
    String webEditorEmail;
}
