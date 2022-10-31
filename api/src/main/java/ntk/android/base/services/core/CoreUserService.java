package ntk.android.base.services.core;

import android.content.Context;

import ntk.android.base.entitymodel.coremain.CoreUserModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class CoreUserService extends CmsApiServerBase<CoreUserModel, Long> {
    public CoreUserService(Context context, String controlerUrl, Class teClass) {
        super(context, "CoreUser", CoreUserModel.class);
    }
}
