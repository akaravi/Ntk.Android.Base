package ntk.android.base.services.news;

import android.content.Context;

import io.reactivex.Observable;
import ntk.android.base.api.news.entity.NewsContent;
import ntk.android.base.dtomodel.core.ScoreClickDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterDataModel;
import ntk.android.base.entitymodel.news.NewsContentModel;
import ntk.android.base.services.base.CmsApiFavoriteBase;
import ntk.android.base.services.base.CmsApiScoreApi;
import ntk.android.base.services.base.CmsApiServerBase;


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

    public Observable<ErrorException<NewsContentModel>> getFavoriteList(FilterDataModel request) {
        return new CmsApiFavoriteBase<NewsContentModel, Long>(context, "NewsContent", NewsContentModel.class).getFavoriteList(request);
    }
    public  Observable<ErrorExceptionBase> scoreClick(ScoreClickDtoModel model){
      return new CmsApiScoreApi<NewsContentModel,Long>(context,"NewsContent", NewsContentModel.class)  .scoreClick(model);
    }
}
