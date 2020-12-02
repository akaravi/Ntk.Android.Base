package ntk.android.base.services.hypershop;

import android.content.Context;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.config.ConfigRestHeader;
import ntk.android.base.config.RetrofitManager;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterDataModel;
import ntk.android.base.entitymodel.hypershop.HyperShopCategoryModel;

class HyperShopCategoryService {
    private final Map<String, String> headers;
    String baseUrl = "api/v1/";
    String controlerUrl = "HyperShopCategory";
    Context context;

    HyperShopCategoryService(Context context) {
        this.context = context;
        headers = new ConfigRestHeader().GetHeaders(context);
    }

    protected IHyperShopCategoryService HyperShopContentService() {
        return new RetrofitManager(context).getRetrofitUnCached().create(IHyperShopCategoryService.class);
    }

    public Observable<ErrorException<HyperShopCategoryModel>> getAllMicroService(FilterDataModel request) {
        BehaviorSubject<ErrorException<HyperShopCategoryModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<HyperShopCategoryModel>> all = HyperShopContentService().GetAll(baseUrl + controlerUrl + "/GetAllMicroService", headers, request);
        all.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<HyperShopCategoryModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<HyperShopCategoryModel> hyperShopContentModelErrorException) {
                mMovieCache.onNext(hyperShopContentModelErrorException);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                mMovieCache.onError(e);
            }

            @Override
            public void onComplete() {

            }
        });
        return mMovieCache;
    }

    public Observable<ErrorException<HyperShopCategoryModel>> getOneMicroService(Long Id) {
        BehaviorSubject<ErrorException<HyperShopCategoryModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<HyperShopCategoryModel>> getone = HyperShopContentService().GetOne(baseUrl + controlerUrl + "/GetOneMicroService/" + Id, headers);
        getone.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<HyperShopCategoryModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<HyperShopCategoryModel> hyperShopContentModelErrorException) {
                mMovieCache.onNext(hyperShopContentModelErrorException);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                mMovieCache.onError(e);
            }

            @Override
            public void onComplete() {

            }
        });
        return mMovieCache;
    }
}
