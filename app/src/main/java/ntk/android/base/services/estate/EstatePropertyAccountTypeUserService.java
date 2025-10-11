package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyAccountTypeUserModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyAccountTypeUserService extends CmsApiServerBase<EstatePropertyAccountTypeUserModel, String> {

    public EstatePropertyAccountTypeUserService(Context context) {
        super(context, "EstatePropertyAccountTypeUser", EstatePropertyAccountTypeUserModel.class);
    }
}
