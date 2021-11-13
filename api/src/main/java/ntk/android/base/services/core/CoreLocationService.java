package ntk.android.base.services.core;

import android.content.Context;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.core.CoreLocationModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class CoreLocationService extends CmsApiServerBase<CoreLocationModel, Long> {

    public CoreLocationService(Context context) {
        super(context, "CoreLocation", CoreLocationModel.class);
    }

    public Observable<ErrorException<CoreLocationModel>> getAllTree(FilterModel model) {
        BehaviorSubject<ErrorException<CoreLocationModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(ILocation.class).GetAllTree(baseUrl + controlerUrl + "/GetAllTree", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<CoreLocationModel> coreLocationModelErrorException) {
                mMovieCache.onNext(coreLocationModelErrorException);
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

    public Observable<ErrorException<CoreLocationModel>> getAllCities(FilterModel model) {
        BehaviorSubject<ErrorException<CoreLocationModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(ILocation.class).GetAllCities(baseUrl + controlerUrl + "/GetAllCities", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<CoreLocationModel> coreLocationModelErrorException) {
                mMovieCache.onNext(coreLocationModelErrorException);
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
    public Observable<ErrorException<CoreLocationModel>> getAllProvinces(FilterModel model) {
        BehaviorSubject<ErrorException<CoreLocationModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(ILocation.class).GetAllProvinces(baseUrl + controlerUrl + "/GetAllProvinces", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<CoreLocationModel> coreLocationModelErrorException) {
                mMovieCache.onNext(coreLocationModelErrorException);
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

    public Observable<ErrorException<CoreLocationModel>> getAllNeighbourhoods(FilterModel model) {
        BehaviorSubject<ErrorException<CoreLocationModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(ILocation.class).GetAllNeighbourhoods(baseUrl + controlerUrl + "/GetAllNeighbourhoods", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<CoreLocationModel> coreLocationModelErrorException) {
                mMovieCache.onNext(coreLocationModelErrorException);
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
