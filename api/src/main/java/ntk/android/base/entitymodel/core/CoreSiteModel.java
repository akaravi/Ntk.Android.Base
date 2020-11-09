package ntk.android.base.entitymodel.core;

class CoreSiteModel {
    CurrentSiteDomainUrl: string;
    MainImageSrc: string;

    expireDate?: string;
    linkCreatedBySiteId?: number;
    // tslint:disable-next-line: variable-name
    virtual_ParentCreator: CoreSiteModel;
    parentCreator: CoreSiteModel;
    Title: string;
    ownerSiteSetStatus: EnumSiteStatus;
    userLanguage: number;
    subDomain: string;
    domain: string;
    redirect: string;
    keyword: string;
    description: string;
    linkFavIconId?: number;
    linkSiteCategoryId: number;
    // tslint:disable-next-line: variable-name
    virtual_CmsSiteCategory: CoreSiteCategoryModel;
    cmsSiteCategory: CoreSiteCategoryModel;
    hasAccountingForm: boolean;
    viewInCmsSiteLIst: boolean;
    accountingFormNo: number;
    accountingFormCreatedDate?: string;
    accountingFormUpdatedDate?: string;
    siteUsers: CoreSiteUserModel[];
    moduleSites: CoreModuleSiteModel[];
    domainAliases: CoreSiteDomainAliasModel[];
    childernCreateds: CoreSiteModel[];
    devices: CoreDeviceModel[];
    copyright: string;
    webMasterEmail: string;
    webEditorEmail: string;
}
