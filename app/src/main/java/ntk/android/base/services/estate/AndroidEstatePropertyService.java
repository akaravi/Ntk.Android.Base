package ntk.android.base.services.estate;

import android.content.Context;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.estate.EstatePropertyModel;

public class AndroidEstatePropertyService extends EstatePropertyService {
    String orderId;

    public AndroidEstatePropertyService(Context context, String orderId) {
        super(context);
        this.orderId = orderId;
    }

    public Observable<ErrorException<EstatePropertyModel>> allWithCustomerOrderId(FilterModel request) {
        return new EstatePropertyService(context).getAllWithCustomerOrderId(orderId, request);
    }

}
