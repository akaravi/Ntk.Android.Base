package ntk.android.base.entitymodel.core;

class CoreModuleProcessModel {
    TitleML: string;
    Title: string;
    titleResourceLanguage: string;
    titleEn: string;
    processName: string;
    description: string;
    linkModuleId?: number;
    // tslint:disable-next-line: variable-name
    virtual_CmsModule: CoreModuleModel;
    cmsModule: CoreModuleModel;
    cmsModuleProcessCustomize: CoreModuleProcessCustomizeModel[];
}
