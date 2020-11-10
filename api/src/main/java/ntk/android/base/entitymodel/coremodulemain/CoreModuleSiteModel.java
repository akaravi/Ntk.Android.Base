package ntk.android.base.entitymodel.coremodulemain;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.core.CoreModuleModel;
import ntk.android.base.entitymodel.core.CoreSiteModel;

public class CoreModuleSiteModel extends BaseEntity<Long> {
    String expireDate;
    long linkSiteId;
    String Title;
    long linkModuleId;
    String renewDate;
    boolean hasBuyed;

    CoreSiteModel virtual_CmsSite;
    CoreSiteModel cmsSite;
   
    CoreModuleModel virtual_CmsModule;
    CoreModuleModel cmsModule;
    String moduleConfigSiteAccessValuesJson;
    String moduleConfigSiteValuesJson;
    String moduleSiteStorageValuesJson;
}
