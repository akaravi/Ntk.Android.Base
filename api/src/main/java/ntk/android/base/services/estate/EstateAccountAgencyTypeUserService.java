package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstateAccountAgencyTypeUserModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstateAccountAgencyTypeUserService extends CmsApiServerBase<EstateAccountAgencyTypeUserModel, String> {
    public EstateAccountAgencyTypeUserService(Context context) {
        super(context, "EstateAccountAgencyTypeUser", EstateAccountAgencyTypeUserModel.class);
    }
}
