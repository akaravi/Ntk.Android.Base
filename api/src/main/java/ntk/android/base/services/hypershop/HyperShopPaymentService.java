package ntk.android.base.services.hypershop;

import android.content.Context;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.config.NtkObserver;
import ntk.android.base.dtomodel.hypershop.HyperShopPaymentDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.hypershop.HyperShopPaymentModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class HyperShopPaymentService extends CmsApiServerBase<HyperShopPaymentModel, Long> {
    public HyperShopPaymentService(Context context) {
        super(context, "HyperShopPayment", HyperShopPaymentModel.class);
    }


}
