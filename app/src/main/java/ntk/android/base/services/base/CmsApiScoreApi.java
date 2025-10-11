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

public class CmsApiScoreApi<TEntity, TKey> {
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
        Observable<ErrorExceptionBase> getone = ICmsApiScoreApi().ScoreClick(baseUrl + controlerUrl + "/ScoreClick", headers, model);
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

    public static double CONVERT_TO_RATE(int sumClick, long sumScore) {
        if(sumClick==0)
            sumClick=1;
        double rating = .5;
        if (sumScore / sumClick > 0 && sumScore / sumClick <= 10) {
            rating = 0.5;
        } else if (sumScore / sumClick > 10 && sumScore / sumClick <= 20) {
            rating = 1.0;
        } else if (sumScore / sumClick > 20 && sumScore / sumClick <= 30) {
            rating = 1.5;
        } else if (sumScore / sumClick > 30 && sumScore / sumClick <= 40) {
            rating = 2.0;
        } else if (sumScore / sumClick > 40 && sumScore / sumClick <= 50) {
            rating = 2.5;
        } else if (sumScore / sumClick > 50 && sumScore / sumClick <= 60) {
            rating = 3.0;
        } else if (sumScore / sumClick > 60 && sumScore / sumClick <= 70) {
            rating = 3.5;
        } else if (sumScore / sumClick > 70 && sumScore / sumClick <= 80) {
            rating = 4.0;
        } else if (sumScore / sumClick > 80 && sumScore / sumClick <= 90) {
            rating = 4.5;
        } else if (sumScore / sumClick > 90) {
            rating = 5.0;
        }
        return rating;
    }
}
