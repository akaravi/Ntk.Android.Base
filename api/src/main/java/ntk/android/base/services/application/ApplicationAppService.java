package ntk.android.base.services.application;

import android.content.Context;

import com.google.gson.JsonObject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.dtomodel.application.AboutUsDtoModel;
import ntk.android.base.dtomodel.application.AppThemeDtoModel;
import ntk.android.base.dtomodel.application.ApplicationScoreDtoModel;
import ntk.android.base.dtomodel.application.MainResponseDtoModel;
import ntk.android.base.entitymodel.application.ApplicationAppModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.services.base.CmsApiServerBase;

public class ApplicationAppService extends CmsApiServerBase<ApplicationAppModel, Long> {

    public ApplicationAppService(Context context) {
        super(context, "Application", ApplicationAppModel.class);
    }

    public Observable<ErrorExceptionBase> submitAppScore(ApplicationScoreDtoModel model) {
        BehaviorSubject<ErrorExceptionBase> mMovieCache = BehaviorSubject.create();

        getRetrofit(ICmsApiApplication.class).ScoreClick(baseUrl + controlerUrl + "/ScoreClick", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorExceptionBase>() {

            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorExceptionBase errorExceptionBase) {
                mMovieCache.onNext(errorExceptionBase);
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

    public Observable<ErrorException<AppThemeDtoModel>> getAppTheme() {
        BehaviorSubject<ErrorException<AppThemeDtoModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(ICmsApiApplication.class).GetThemeCore(headers)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<AppThemeDtoModel>>() {

            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<AppThemeDtoModel> errorExceptionBase) {
                mMovieCache.onNext(errorExceptionBase);
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

    public Observable<ErrorException<AboutUsDtoModel>> getAboutUs() {
        BehaviorSubject<ErrorException<AboutUsDtoModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(ICmsApiApplication.class).GetAbout(headers)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<AboutUsDtoModel>>() {

            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<AboutUsDtoModel> errorExceptionBase) {
                mMovieCache.onNext(errorExceptionBase);
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

    public Observable<ErrorException<MainResponseDtoModel>> getResponseMain() {
        BehaviorSubject<ErrorException<MainResponseDtoModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(ICmsApiApplication.class).GetResponseMain(headers)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<MainResponseDtoModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<MainResponseDtoModel> main) {
                mMovieCache.onNext(main);
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

    public Observable<ErrorException<ApplicationAppModel>> currentApp() {
        BehaviorSubject<ErrorException<ApplicationAppModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(ICmsApiApplication.class).CurrentDevice(baseUrl + controlerUrl + "/CurrentApp", headers)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<ApplicationAppModel>>() {

            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull ErrorException<ApplicationAppModel> errorExceptionBase) {
                mMovieCache.onNext(errorExceptionBase);
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
    public Observable<JsonObject> currentAppTest() {
        BehaviorSubject<JsonObject> mMovieCache = BehaviorSubject.create();

        getRetrofit(ICmsApiApplication.class).CurrentDeviceTest(baseUrl + controlerUrl + "/CurrentApp", headers)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<JsonObject>() {

            @Override
            public void onSubscribe(@NonNull Disposable d) {
            }

            @Override
            public void onNext(@NonNull JsonObject errorExceptionBase) {
                 mMovieCache.onNext(errorExceptionBase);
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
