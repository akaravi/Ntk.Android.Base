package ntk.android.base.services.article;

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
import ntk.android.base.dtomodel.core.ScoreClickDtoModel;
import ntk.android.base.entitymodel.article.ArticleContentModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.news.NewsCommentModel;
import ntk.android.base.services.base.CmsApiFavoriteBase;
import ntk.android.base.services.base.CmsApiScoreApi;
import ntk.android.base.services.base.CmsApiServerBase;
import ntk.android.base.services.base.CmsApiSimilar;


public class ArticleContentService extends CmsApiServerBase<ArticleContentModel, Long> {


    public ArticleContentService(Context context) {
        super(context, "ArticleContent", ArticleContentModel.class);
    }

    public Observable<ErrorExceptionBase> addFavorite(long Id) {
        return new CmsApiFavoriteBase<ArticleContentModel, Long>(context, "ArticleContent", ArticleContentModel.class).addFavorite(Id);
    }

    public Observable<ErrorExceptionBase> removeFavorite(long Id) {
        return new CmsApiFavoriteBase<ArticleContentModel, Long>(context, "ArticleContent", ArticleContentModel.class).removeFavorite(Id);
    }

    public Observable<ErrorException<ArticleContentModel>> getFavoriteList(FilterModel request) {
        return new CmsApiFavoriteBase<ArticleContentModel, Long>(context, "ArticleContent", ArticleContentModel.class).getFavoriteList(request);
    }

    public Observable<ErrorExceptionBase> scoreClick(ScoreClickDtoModel model) {
        return new CmsApiScoreApi<ArticleContentModel, Long>(context, "ArticleContent", ArticleContentModel.class).scoreClick(model);
    }

    public Observable<ErrorException<ArticleContentModel>> getAllWithCategoryUsedInContent(long id, FilterModel request) {
        BehaviorSubject<ErrorException<ArticleContentModel>> mMovieCache = BehaviorSubject.create();

        ICmsApiServerBase().getAll(baseUrl + controlerUrl + "/GetAllWithCategoryUseInContentId/" + id, headers, request)
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
                        o.Item = gson.fromJson(gson.toJson(o.Item), ArticleContentModel.class);
                        o.ListItems = gson.fromJson(gson.toJson(o.ListItems), new ListOfJson<ArticleContentModel>(ArticleContentModel.class));
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

    public Observable<ErrorException<ArticleContentModel>> getAllWithHierarchyCategoryId(long id, FilterModel request) {
        BehaviorSubject<ErrorException<ArticleContentModel>> mMovieCache = BehaviorSubject.create();

        ICmsApiServerBase().getAll(baseUrl + controlerUrl + "/GetAllWithHierarchyCategoryId/" + id, headers, request)
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
                        o.Item = gson.fromJson(gson.toJson(o.Item), ArticleContentModel.class);
                        o.ListItems = gson.fromJson(gson.toJson(o.ListItems), new ListOfJson<ArticleContentModel>(ArticleContentModel.class));
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
    public Observable<ErrorException<ArticleContentModel>> getAllWithSimilarsId(Long id, FilterModel filter){
        return new CmsApiSimilar<ArticleContentModel,Long>(context,"ArticleContent", ArticleContentModel.class).GetAllWithSimilarsId(id,filter);
    }
}
