package ntk.android.base.services.base;

import android.content.Context;

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
import ntk.android.base.entitymodel.base.FilterDataModel;

public class CmsApiServerBase<TEntity, TKey> {
    String baseUrl = "api/v1/";
    String controlerUrl;
    Context context;
    Map<String, String> headers;
    Class<TEntity> teClass;

    public CmsApiServerBase(Context context, String controlerUrl, Class<TEntity> teClass) {
        this.controlerUrl = controlerUrl;
        headers = new ConfigRestHeader().GetHeaders(context);
        this.teClass = teClass;
    }

    ICmsApiServerBase ICmsApiServerBase() {
        ICmsApiServerBase iCmsApiServerBase = new RetrofitManager(context).getRetrofitUnCached().create(ICmsApiServerBase.class);
        return iCmsApiServerBase;

    }

    public Observable<ErrorException<TEntity>> getAll(FilterDataModel request) {
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
        return ICmsApiServerBase().getViewModel(baseUrl + controlerUrl + "/getViewModel", headers);
    }

    public Observable<ErrorException<TEntity>> getOne(TKey Id) {
        return ICmsApiServerBase().getViewModel(baseUrl + controlerUrl + "/" + Id, headers);
    }

    public Observable<ErrorExceptionBase> Exist(FilterDataModel request) {
        return ICmsApiServerBase().Exist(baseUrl + controlerUrl + "/Exist", headers, request);

    }

    public Observable<ErrorExceptionBase> Count(FilterDataModel request) {
        return ICmsApiServerBase().Count(baseUrl + controlerUrl + "/Count", headers, request);

    }

    public Observable<ErrorExceptionBase> ExportFile(FilterDataModel request) {
        return ICmsApiServerBase().ExportFile(baseUrl + controlerUrl + "/ExportFile", headers, request);

    }

    public Observable<ErrorExceptionBase> Add(TEntity request) {
        return ICmsApiServerBase().Add(baseUrl + controlerUrl + "/", headers, request);

    }

    public Observable<ErrorExceptionBase> Edit(TEntity request) {
        return ICmsApiServerBase().Edit(baseUrl + controlerUrl + "/1", headers, request);

    }

    public Observable<ErrorExceptionBase> Delete(TKey id) {
        return ICmsApiServerBase().Delete(baseUrl + controlerUrl + "/" + id, headers);

    }

    public Observable<ErrorExceptionBase> Delete(List<TKey> request) {
        return ICmsApiServerBase().Delete(baseUrl + controlerUrl + "/DeleteList", headers, request);

    }


}
