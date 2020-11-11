package ntk.android.base.services.base;

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
import ntk.android.base.dtomodel.core.ScoreClickDtoModel;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;

public  class CmsApiScoreApi<TEntity, TKey> {
        String baseUrl = "api/v1/";
        String controlerUrl;
        Context context;
        Map<String, String> headers;
        Class<TEntity> teClass;

public CmsApiScoreApi(Context context, String controlerUrl, Class<TEntity> teClass) {
        this.controlerUrl = controlerUrl;
        headers = new ConfigRestHeader().GetHeaders(context);
        this.teClass = teClass;
        }

    ICmsApiScoreApi ICmsApiScoreApi() {
        ICmsApiScoreApi iCmsApiServerBase = new RetrofitManager(context).getRetrofitUnCached().create(ICmsApiScoreApi.class);
        return iCmsApiServerBase;

        }
    public Observable<ErrorExceptionBase> scoreClick(ScoreClickDtoModel model) {
        BehaviorSubject<ErrorExceptionBase> mMovieCache = BehaviorSubject.create();
        Observable<ErrorExceptionBase> getone = ICmsApiScoreApi().ScoreClick(baseUrl + controlerUrl + "/ScoreClick" , headers,model);
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

}
