package ntk.android.base.services.base;

import android.content.Context;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.config.ConfigRestHeader;
import ntk.android.base.config.ListOfJson;
import ntk.android.base.config.RetrofitManager;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterDataModel;

public class CmsApiFavoriteBase<TEntity, TKey> {
    String baseUrl = "api/v1/";
    String controlerUrl;
    Context context;
    Map<String, String> headers;
    Class<TEntity> teClass;

    public CmsApiFavoriteBase(Context context, String controlerUrl, Class<TEntity> teClass) {
        this.controlerUrl = controlerUrl;
        headers = new ConfigRestHeader().GetHeaders(context);
        this.teClass = teClass;
    }

    ICmsApiFavorite ICmsApiFavorite() {
        ICmsApiFavorite iCmsApiServerBase = new RetrofitManager(context).getRetrofitUnCached().create(ICmsApiFavorite.class);
        return iCmsApiServerBase;

    }

    public Observable<ErrorExceptionBase> addFavorite(TKey Id) {
        BehaviorSubject<ErrorExceptionBase> mMovieCache = BehaviorSubject.create();
        Observable<ErrorExceptionBase> getone = ICmsApiFavorite().AddFavorite(baseUrl + controlerUrl + "/FavoriteAdd/" + Id, headers);
        getone.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorExceptionBase>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorExceptionBase o) {
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

    public Observable<ErrorExceptionBase> removeFavorite(TKey Id) {
        BehaviorSubject<ErrorExceptionBase> mMovieCache = BehaviorSubject.create();
        Observable<ErrorExceptionBase> getone = ICmsApiFavorite().AddFavorite(baseUrl + controlerUrl + "/FavoriteRemove/" + Id, headers);
        getone.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorExceptionBase>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorExceptionBase o) {
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

    public Observable<ErrorException<TEntity>> getFavoriteList(FilterDataModel request) {
        BehaviorSubject<ErrorException<TEntity>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException> all = ICmsApiFavorite().GetFavoriteList(baseUrl + controlerUrl + "/FavoriteList", headers, request);
        all.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException o) {
                Gson gson = new GsonBuilder()
                        .enableComplexMapKeySerialization()
                        .setDateFormat("yyyy-MM-dd'T'hh:mm:ss").serializeNulls()
                        .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                        .setExclusionStrategies()
                        .create();
                o.Item = gson.fromJson(gson.toJson(o.Item), teClass);
                o.ListItems = gson.fromJson(gson.toJson(o.ListItems), new ListOfJson<TEntity>(teClass));
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