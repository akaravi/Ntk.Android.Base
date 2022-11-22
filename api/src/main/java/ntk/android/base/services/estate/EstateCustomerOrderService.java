package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstateCustomerOrderModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstateCustomerOrderService  extends CmsApiServerBase<EstateCustomerOrderModel, String> {


    public EstateCustomerOrderService(Context context) {
        super(context, "EstateCustomerOrder", EstateCustomerOrderModel.class);
    }
}
