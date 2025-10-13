package ntk.android.base.services.coremodulemain;

import android.content.Context;

import ntk.android.base.entitymodel.coremodulemain.CoreModuleTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class CoreModuleTagService extends CmsApiServerBase<CoreModuleTagModel, Long> {
    public CoreModuleTagService(Context context) {
        super(context, "CoreModuleTag", CoreModuleTagModel.class);
    }
}