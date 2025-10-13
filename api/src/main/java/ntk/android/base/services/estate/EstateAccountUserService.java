package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstateAccountUserModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstateAccountUserService extends CmsApiServerBase<EstateAccountUserModel, String> {
    public EstateAccountUserService(Context context) {
        super(context, "EstateAccountUser", EstateAccountUserModel.class);
    }
}
