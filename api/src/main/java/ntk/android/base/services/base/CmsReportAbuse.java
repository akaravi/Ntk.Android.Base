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
import ntk.android.base.dtomodel.core.CoreModuleReportAbuseDtoModel;
import ntk.android.base.dtomodel.core.ScoreClickDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;

public class CmsReportAbuse<TEntity, TKey> {
    String baseUrl = "api/v1/";
    String controlerUrl;
    Context context;
    Map<String, String> headers;
    Class<TEntity> teClass;

    public CmsReportAbuse(Context context, String controlerUrl, Class<TEntity> teClass) {
        this.controlerUrl = controlerUrl;
        headers = new ConfigRestHeader().GetHeaders(context);
        this.teClass = teClass;
    }

    IcmsApiReportAbuse CmsReportAbuse() {
        IcmsApiReportAbuse iCmsApiServerBase = new RetrofitManager(context).getRetrofitUnCached().create(IcmsApiReportAbuse.class);
        return iCmsApiServerBase;

    }

    public Observable<ErrorException<TEntity>> addReport(CoreModuleReportAbuseDtoModel model) {
        BehaviorSubject<ErrorException<TEntity>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException> getone = CmsReportAbuse().addReport(baseUrl + controlerUrl + "/ReportAbuseAdd", headers, model);
        getone.observeOn(AndroidSchedulers.mainThread())
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
