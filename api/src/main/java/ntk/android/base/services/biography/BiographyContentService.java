package ntk.android.base.services.biography;

import android.content.Context;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.config.ListOfJson;
import ntk.android.base.dtomodel.biography.BiographyContentWithDatePeriodEndDtoModel;
import ntk.android.base.dtomodel.biography.BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearDtoModel;
import ntk.android.base.dtomodel.biography.BiographyContentWithSimilarDatePeriodStartDayOfYearDtoModel;
import ntk.android.base.dtomodel.core.ScoreClickDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.biography.BiographyContentModel;
import ntk.android.base.services.base.CmsApiFavoriteBase;
import ntk.android.base.services.base.CmsApiScoreApi;
import ntk.android.base.services.base.CmsApiServerBase;
import ntk.android.base.services.base.CmsApiSimilar;


public class BiographyContentService extends CmsApiServerBase<BiographyContentModel, Long> {


    public BiographyContentService(Context context) {
        super(context, "BiographyContent", BiographyContentModel.class);
    }

    public Observable<ErrorExceptionBase> addFavorite(long Id) {
        return new CmsApiFavoriteBase<BiographyContentModel, Long>(context, "BiographyContent", BiographyContentModel.class).addFavorite(Id);
    }

    public Observable<ErrorExceptionBase> removeFavorite(long Id) {
        return new CmsApiFavoriteBase<BiographyContentModel, Long>(context, "BiographyContent", BiographyContentModel.class).removeFavorite(Id);
    }

    public Observable<ErrorException<BiographyContentModel>> getFavoriteList(FilterModel request) {
        return new CmsApiFavoriteBase<BiographyContentModel, Long>(context, "BiographyContent", BiographyContentModel.class).getFavoriteList(request);
    }

    public Observable<ErrorExceptionBase> scoreClick(ScoreClickDtoModel model) {
        return new CmsApiScoreApi<BiographyContentModel, Long>(context, "BiographyContent", BiographyContentModel.class).scoreClick(model);
    }

    public Observable<ErrorException<BiographyContentModel>> getAllWithSimilarsId(Long id, FilterModel filter) {
        return new CmsApiSimilar<BiographyContentModel, Long>(context, "BiographyContent", BiographyContentModel.class).GetAllWithSimilarsId(id, filter);
    }

    public Observable<ErrorException<BiographyContentModel>> getAllWithCategoryUsedInContent(long Id, FilterModel request) {
        BehaviorSubject<ErrorException<BiographyContentModel>> mMovieCache = BehaviorSubject.create();

        ICmsApiServerBase().getAll(baseUrl + controlerUrl + "/GetAllWithCategoryUseInContentId/" + Id, headers, request)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ErrorException>() {
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
                        o.Item = gson.fromJson(gson.toJson(o.Item), BiographyContentModel.class);
                        o.ListItems = gson.fromJson(gson.toJson(o.ListItems), new ListOfJson<BiographyContentModel>(BiographyContentModel.class));
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

    public Observable<ErrorException<BiographyContentModel>> getAllGetAllWithDatePeriodEnd(BiographyContentWithDatePeriodEndDtoModel model) {
        BehaviorSubject<ErrorException<BiographyContentModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(IBiographyContentService.class).GetAllGetAllWithDatePeriodEnd(baseUrl + controlerUrl + "/GetAllWithDatePeriodEnd", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ErrorException<BiographyContentModel>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ErrorException<BiographyContentModel> o) {
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

    public Observable<ErrorException<BiographyContentModel>> getAllWithSimilarDatePeriodStartDayAndMonthOfYear(BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearDtoModel model) {
        BehaviorSubject<ErrorException<BiographyContentModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(IBiographyContentService.class).GetAllWithSimilarDatePeriodStartDayAndMonthOfYear(baseUrl + controlerUrl + "/GetAllWithSimilarDatePeriodStartDayAndMonthOfYear", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ErrorException<BiographyContentModel>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ErrorException<BiographyContentModel> o) {
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

    public Observable<ErrorException<BiographyContentModel>> getAllWithSimilarDatePeriodStartDayOfYear(BiographyContentWithSimilarDatePeriodStartDayOfYearDtoModel model) {
        BehaviorSubject<ErrorException<BiographyContentModel>> mMovieCache = BehaviorSubject.create();

        getRetrofit(IBiographyContentService.class).GetAllWithSimilarDatePeriodStartDayOfYear(baseUrl + controlerUrl + "/GetAllWithSimilarDatePeriodStartDayOfYear", headers, model)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ErrorException<BiographyContentModel>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ErrorException<BiographyContentModel> o) {
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
