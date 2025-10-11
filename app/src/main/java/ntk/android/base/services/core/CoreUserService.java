package ntk.android.base.services.core;

import android.content.Context;

import ntk.android.base.entitymodel.coremain.CoreUserModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class CoreUserService extends CmsApiServerBase<CoreUserModel, Long> {
    public CoreUserService(Context context) {
        super(context, "CoreUser", CoreUserModel.class);
    }
}
