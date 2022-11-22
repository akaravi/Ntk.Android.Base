package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstateCustomerOrderResultModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstateCustomerOrderResultService extends CmsApiServerBase<EstateCustomerOrderResultModel, String> {


    public EstateCustomerOrderResultService(Context context) {
        super(context, "EstateCustomerOrderResult", EstateCustomerOrderResultModel.class);
    }
}