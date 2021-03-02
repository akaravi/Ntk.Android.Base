package ntk.android.base.services.base;

import android.content.Context;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
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
import ntk.android.base.entitymodel.base.FilterModel;

public class CmsApiServerBase<TEntity, TKey> {
    protected final String baseUrl = "api/v1/";
    protected final String controlerUrl;
    protected Context context;
    protected Map<String, String> headers;
    Class<TEntity> teClass;

    public CmsApiServerBase(Context context, String controlerUrl, Class<TEntity> teClass) {
        this.controlerUrl = controlerUrl;
        this.context = context;
        headers = new ConfigRestHeader().GetHeaders(context);
        this.teClass = teClass;
    }

    protected ICmsApiServerBase ICmsApiServerBase() {
        return new RetrofitManager(context).getRetrofitUnCached().create(ICmsApiServerBase.class);

    }

    public <K> K getRetrofit(Class<K> kClass) {
        K iCmsApiServerBase = new RetrofitManager(context).getRetrofitUnCached().create(kClass);
        return iCmsApiServerBase;

    }

    public Observable<ErrorException<TEntity>> getAll(FilterModel request) {
        BehaviorSubject<ErrorException<TEntity>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException> all = ICmsApiServerBase().getAll(baseUrl + controlerUrl + "/getAll", headers, request);
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


    public Observable<ErrorException<TEntity>> getViewModel() {
        BehaviorSubject<ErrorException<TEntity>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException> ViewModel = ICmsApiServerBase().getViewModel(baseUrl + controlerUrl + "/getViewModel", headers);
        ViewModel.observeOn(AndroidSchedulers.mainThread())
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

    public Observable<ErrorException<TEntity>> getOne(TKey Id) {
        BehaviorSubject<ErrorException<TEntity>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException> getone = ICmsApiServerBase().getOne(baseUrl + controlerUrl + "/" + Id, headers);
        getone.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException o) {
                ErrorException a = new ErrorException();
                Gson gson = new GsonBuilder()
                        .enableComplexMapKeySerialization()
                        .setDateFormat("yyyy-MM-dd'T'hh:mm:ss").serializeNulls()
                        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
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

    public Observable<ErrorExceptionBase> exist(FilterModel request) {
        BehaviorSubject<ErrorExceptionBase> mMovieCache = BehaviorSubject.create();
        ICmsApiServerBase().Exist(baseUrl + controlerUrl + "/Exist", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
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

    public Observable<ErrorExceptionBase> count(FilterModel request) {
        BehaviorSubject<ErrorExceptionBase> mMovieCache = BehaviorSubject.create();
        ICmsApiServerBase().Count(baseUrl + controlerUrl + "/Count", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
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

    public Observable<ErrorExceptionBase> exportFile(FilterModel request) {
        BehaviorSubject<ErrorExceptionBase> mMovieCache = BehaviorSubject.create();
        ICmsApiServerBase().ExportFile(baseUrl + controlerUrl + "/ExportFile", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
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

    public Observable<ErrorException<TEntity>> add(TEntity request) {
        BehaviorSubject<ErrorException<TEntity>> mMovieCache = BehaviorSubject.create();

        ICmsApiServerBase().Add(baseUrl + controlerUrl + "/", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
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

    public Observable<ErrorException<TEntity>> edit(TEntity request) {
        BehaviorSubject<ErrorException<TEntity>> mMovieCache = BehaviorSubject.create();
        ICmsApiServerBase().Edit(baseUrl + controlerUrl , headers, request)
                .observeOn(AndroidSchedulers.mainThread())
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

    public Observable<ErrorException<TEntity>> delete(TKey id) {
        BehaviorSubject<ErrorException<TEntity>> mMovieCache = BehaviorSubject.create();
        ICmsApiServerBase().Delete(baseUrl + controlerUrl + "/" + id, headers)
                .observeOn(AndroidSchedulers.mainThread())
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

    public Observable<ErrorException<TEntity>> delete(List<TKey> request) {
        BehaviorSubject<ErrorException<TEntity>> mMovieCache = BehaviorSubject.create();
        ICmsApiServerBase().Delete(baseUrl + controlerUrl + "/DeleteList", headers, request)
                .observeOn(AndroidSchedulers.mainThread())
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
