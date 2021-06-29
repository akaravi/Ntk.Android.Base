package ntk.android.base.services.application;

import android.content.Context;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.entitymodel.application.ApplicationThemeConfigModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.services.base.CmsApiServerBase;

class ApplicationThemeService extends CmsApiServerBase<ApplicationThemeConfigModel, Long> {

    public ApplicationThemeService(Context context) {
        super(context, "ApplicationThemeConfig", ApplicationThemeConfigModel.class);
    }

    public Observable<ErrorException<ApplicationThemeConfigModel>> getAppTheme() {
        BehaviorSubject<ErrorException<ApplicationThemeConfigModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(ICmsApiApplication.class).GetThemeCore(baseUrl + controlerUrl + "/CurrentTheme", headers)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<ApplicationThemeConfigModel>>() {

            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<ApplicationThemeConfigModel> errorExceptionBase) {
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
