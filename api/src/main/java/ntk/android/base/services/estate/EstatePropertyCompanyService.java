package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstateCompanyModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyCompanyService extends CmsApiServerBase<EstateCompanyModel, String> {
    public EstatePropertyCompanyService(Context context) {
        super(context, "EstatePropertyCompany", EstateCompanyModel.class);
    }
}
