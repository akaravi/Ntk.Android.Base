package ntk.android.base.services.application;

import android.content.Context;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.dtomodel.application.ApplicationScoreDtoModel;
import ntk.android.base.entitymodel.application.ApplicationAppModel;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.services.base.CmsApiServerBase;

public class ApplicationAppService extends CmsApiServerBase<ApplicationAppModel, Long> {

    public ApplicationAppService(Context context) {
        super(context, "ApplicationApp", ApplicationAppModel.class);
    }

    public Observable<ErrorExceptionBase> ServiceScoreClick(ApplicationScoreDtoModel model) {
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
                onError(e);
            }

            @Override
            public void onComplete() {

            }
        });
        return mMovieCache;
    }


}
