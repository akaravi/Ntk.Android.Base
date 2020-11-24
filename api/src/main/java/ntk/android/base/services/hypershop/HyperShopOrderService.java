package ntk.android.base.services.hypershop;

import android.content.Context;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.config.NtkObserver;
import ntk.android.base.dtomodel.hypershop.HyperShopOrderDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.hypershop.HyperShopOrderModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class HyperShopOrderService extends CmsApiServerBase<HyperShopOrderModel, Long> {
    public HyperShopOrderService(Context context) {
        super(context, "HyperShopOrder", HyperShopOrderModel.class);
    }

    public Observable<ErrorException<HyperShopOrderDtoModel>> orderAdd(HyperShopOrderDtoModel model) {
        BehaviorSubject<ErrorException<HyperShopOrderDtoModel>> mMovieCache = BehaviorSubject.create();
        getRetrofit(IHyperShopOrderService.class).OrderAdd(baseUrl + controlerUrl + "/OrderAdd", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new NtkObserver<ErrorException<HyperShopOrderDtoModel>>() {
            @Override
            public void onNext(@NonNull ErrorException<HyperShopOrderDtoModel> hyperShopOrderDtoModelErrorException) {
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
