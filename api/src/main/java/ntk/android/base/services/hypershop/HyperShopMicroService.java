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
import ntk.android.base.dtomodel.hypershop.HyperShopCategoryModel;
import ntk.android.base.dtomodel.hypershop.HyperShopContentModel;
import ntk.android.base.dtomodel.hypershop.HyperShopOrderModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterDataModel;

public class HyperShopMicroService {
    String baseUrl = "api/v1/";
    String controlerUrl;
    Context context;
    Map<String, String> headers;
    Class<HyperShopContentModel> teClass;

    public HyperShopMicroService(Context context, String controlerUrl, Class<HyperShopContentModel> teClass) {
        this.controlerUrl = controlerUrl;
        headers = new ConfigRestHeader().GetHeaders(context);
        this.teClass = teClass;
    }

    IHyperShopMicroService IHyperShopMicroService() {
        IHyperShopMicroService iCmsApiServerBase = new RetrofitManager(context).getRetrofitUnCached().create(IHyperShopMicroService.class);
        return iCmsApiServerBase;

    }

    public Observable<ErrorException<HyperShopContentModel>> getAllContent(FilterDataModel request) {
        BehaviorSubject<ErrorException<HyperShopContentModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<HyperShopContentModel>> all = IHyperShopMicroService().ContentGetAll(baseUrl + controlerUrl + "/ContentGetAll", headers, request);
        all.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<HyperShopContentModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<HyperShopContentModel> o) {
                mMovieCache.onNext(o);
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

    public Observable<ErrorException<HyperShopContentModel>> getOneContent(String Id) {
        BehaviorSubject<ErrorException<HyperShopContentModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<HyperShopContentModel>> all = IHyperShopMicroService().ContentGetOne(baseUrl + controlerUrl + "/ContentGetOne/" + Id, headers);
        all.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<HyperShopContentModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<HyperShopContentModel> o) {
                mMovieCache.onNext(o);
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

    public Observable<ErrorException<HyperShopCategoryModel>> getAllCategory(FilterDataModel request) {
        BehaviorSubject<ErrorException<HyperShopCategoryModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<HyperShopCategoryModel>> all = IHyperShopMicroService().CategoryGetAll(baseUrl + controlerUrl + "/getAll", headers, request);
        all.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<HyperShopCategoryModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<HyperShopCategoryModel> o) {
                mMovieCache.onNext(o);
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

    public Observable<ErrorException<HyperShopCategoryModel>> getOneCategory(String Id) {
        BehaviorSubject<ErrorException<HyperShopCategoryModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<HyperShopCategoryModel>> all = IHyperShopMicroService().CategoryGetOne(baseUrl + controlerUrl + "/ContentGetOne/" + Id, headers);
        all.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<HyperShopCategoryModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<HyperShopCategoryModel> o) {
                mMovieCache.onNext(o);
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

    public Observable<ErrorException<HyperShopOrderModel>> OrderAdd(FilterDataModel request) {
        BehaviorSubject<ErrorException<HyperShopOrderModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<HyperShopOrderModel>> all = IHyperShopMicroService().OrderAdd(baseUrl + controlerUrl + "/OrderAdd/", headers, request);
        all.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<HyperShopOrderModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<HyperShopOrderModel> o) {
                mMovieCache.onNext(o);
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
