package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstateAccountAgencyModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstateAccountAgencyService extends CmsApiServerBase<EstateAccountAgencyModel, String> {
    public EstateAccountAgencyService(Context context) {
        super(context, "EstateAccountAgency", EstateAccountAgencyModel.class);
    }
}
