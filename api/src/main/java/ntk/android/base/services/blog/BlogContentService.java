package ntk.android.base.services.blog;

import android.content.Context;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.core.ScoreClickDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterDataModel;
import ntk.android.base.entitymodel.blog.BlogContentModel;
import ntk.android.base.services.base.CmsApiFavoriteBase;
import ntk.android.base.services.base.CmsApiScoreApi;
import ntk.android.base.services.base.CmsApiServerBase;


public class BlogContentService extends CmsApiServerBase<BlogContentModel, Long> {


    public BlogContentService(Context context) {
        super(context, "BlogContent", BlogContentModel.class);
    }

    public Observable<ErrorExceptionBase> addFavorite(long Id) {
        return new CmsApiFavoriteBase<BlogContentModel, Long>(context, "BlogContent", BlogContentModel.class).addFavorite(Id);
    }

    public Observable<ErrorExceptionBase> removeFavorite(long Id) {
        return new CmsApiFavoriteBase<BlogContentModel, Long>(context, "BlogContent", BlogContentModel.class).removeFavorite(Id);
    }

    public Observable<ErrorException<BlogContentModel>> getFavoriteList(FilterDataModel request) {
        return new CmsApiFavoriteBase<BlogContentModel, Long>(context, "BlogContent", BlogContentModel.class).getFavoriteList(request);
    }
    public  Observable<ErrorExceptionBase> scoreClick(ScoreClickDtoModel model){
        return new CmsApiScoreApi<BlogContentModel,Long>(context,"BlogContent", BlogContentModel.class)  .scoreClick(model);
    }
}
