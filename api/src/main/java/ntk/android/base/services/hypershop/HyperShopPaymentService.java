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

class HyperShopPaymentService extends CmsApiServerBase<HyperShopPaymentModel, Long> {
    public HyperShopPaymentService(Context context, String controlerUrl, Class<HyperShopPaymentModel> teClass) {
        super(context, "HyperShopPayment", HyperShopPaymentModel.class);
    }

    public Observable<ErrorException<HyperShopPaymentDtoModel>> paymentAdd(HyperShopPaymentDtoModel model) {
        BehaviorSubject<ErrorException<HyperShopPaymentDtoModel>> mMovieCache = BehaviorSubject.create();
        getRetrofit(IHyperShopPaymentService.class).PaymentAdd(baseUrl + controlerUrl + "/PaymentAdd", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new NtkObserver<ErrorException<HyperShopPaymentDtoModel>>() {
            @Override
            public void onNext(@NonNull ErrorException<HyperShopPaymentDtoModel> hyperShopOrderDtoModelErrorException) {
                mMovieCache.onNext(hyperShopOrderDtoModelErrorException);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                mMovieCache.onError(e);
            }
        });
        return mMovieCache;
    }

}
