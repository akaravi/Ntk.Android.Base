package ntk.android.base.services.coremodulemain;

import android.content.Context;

import ntk.android.base.entitymodel.coremodulemain.CoreModuleTagCategoryModel;
import ntk.android.base.services.base.CmsApiServerBase;

class CoreModuleTagCategoryService extends CmsApiServerBase<CoreModuleTagCategoryModel, Long> {
    public CoreModuleTagCategoryService(Context context) {
        super(context, "CoreModuleTagCategory", CoreModuleTagCategoryModel.class);
    }
}
