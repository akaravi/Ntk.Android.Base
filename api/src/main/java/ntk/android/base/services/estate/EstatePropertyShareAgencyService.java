package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyShareAgencyModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyShareAgencyService extends CmsApiServerBase<EstatePropertyShareAgencyModel,String> {
    public EstatePropertyShareAgencyService(Context context) {
        super(context, "EstatePropertyShareAgency", EstatePropertyShareAgencyModel.class);
    }
}
