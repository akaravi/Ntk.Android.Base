package ntk.android.base.services.hypershop;

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
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterDataModel;
import ntk.android.base.entitymodel.hypershop.HyperShopContentModel;

public class HyperShopContentService {
    private final Map<String, String> headers;
    String baseUrl = "api/v1/";
    String controlerUrl = "HyperShopContent";
    Context context;

    public HyperShopContentService(Context context) {
        this.context = context;
        headers = new ConfigRestHeader().GetHeaders(context);
    }

    protected IHyperShopContentService HyperShopContentService() {
        return new RetrofitManager(context).getRetrofitUnCached().create(IHyperShopContentService.class);
    }

    public Observable<ErrorException<HyperShopContentModel>> getAll(FilterDataModel request) {
        BehaviorSubject<ErrorException<HyperShopContentModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<HyperShopContentModel>> all = HyperShopContentService().GetAll(baseUrl + controlerUrl + "/GetAll", headers, request);
        all.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<HyperShopContentModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<HyperShopContentModel> hyperShopContentModelErrorException) {
                mMovieCache.onNext(hyperShopContentModelErrorException);
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

    public Observable<ErrorException<HyperShopContentModel>> getOne(Long Id) {
        BehaviorSubject<ErrorException<HyperShopContentModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException<HyperShopContentModel>> getone = HyperShopContentService().GetOne(baseUrl + controlerUrl + "/" + Id, headers);
        getone.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException<HyperShopContentModel>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ErrorException<HyperShopContentModel> hyperShopContentModelErrorException) {
                mMovieCache.onNext(hyperShopContentModelErrorException);
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
