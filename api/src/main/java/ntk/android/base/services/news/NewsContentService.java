package ntk.android.base.services.news;

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
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.news.NewsCommentModel;
import ntk.android.base.entitymodel.news.NewsContentModel;
import ntk.android.base.services.base.CmsApiFavoriteBase;
import ntk.android.base.services.base.CmsApiScoreApi;
import ntk.android.base.services.base.CmsApiServerBase;
import ntk.android.base.services.base.CmsApiSimilar;


public class NewsContentService extends CmsApiServerBase<NewsContentModel, Long> {


    public NewsContentService(Context context) {
        super(context, "NewsContent", NewsContentModel.class);
    }

    public Observable<ErrorExceptionBase> addFavorite(long Id) {
        return new CmsApiFavoriteBase<NewsContentModel, Long>(context, "NewsContent", NewsContentModel.class).addFavorite(Id);
    }

    public Observable<ErrorExceptionBase> removeFavorite(long Id) {
        return new CmsApiFavoriteBase<NewsContentModel, Long>(context, "NewsContent", NewsContentModel.class).removeFavorite(Id);
    }

    public Observable<ErrorException<NewsContentModel>> getFavoriteList(FilterModel request) {
        return new CmsApiFavoriteBase<NewsContentModel, Long>(context, "NewsContent", NewsContentModel.class).getFavoriteList(request);
    }

    public Observable<ErrorExceptionBase> scoreClick(ScoreClickDtoModel model) {
        return new CmsApiScoreApi<NewsContentModel, Long>(context, "NewsContent", NewsContentModel.class).scoreClick(model);
    }

    public Observable<ErrorException<NewsContentModel>> getAllWithSimilarsId(Long id, FilterModel filter){
        return new CmsApiSimilar<NewsContentModel,Long>(context,"NewsContent", NewsContentModel.class).GetAllWithSimilarsId(id,filter);
    }
    public Observable<ErrorException<NewsContentModel>> getAllWithCategoryUsedInContent(long Id, FilterModel request) {
        BehaviorSubject<ErrorException<NewsContentModel>> mMovieCache = BehaviorSubject.create();

        ICmsApiServerBase().getAll(baseUrl + controlerUrl + "GetAllWithCategoryUseInContentId/" + Id, headers, request)
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
                        o.Item = gson.fromJson(gson.toJson(o.Item), NewsCommentModel.class);
                        o.ListItems = gson.fromJson(gson.toJson(o.ListItems), new ListOfJson<NewsCommentModel>(NewsCommentModel.class));
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
