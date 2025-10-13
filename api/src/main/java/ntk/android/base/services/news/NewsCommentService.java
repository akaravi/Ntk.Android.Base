package ntk.android.base.services.news;

import android.content.Context;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.news.NewsCommentModel;
import ntk.android.base.services.base.CmsApiLikeAction;
import ntk.android.base.services.base.CmsApiServerBase;

public class NewsCommentService extends CmsApiServerBase<NewsCommentModel, Long> {
    public NewsCommentService(Context context) {
        super(context, "NewsComment", NewsCommentModel.class);
    }

    public Observable<ErrorExceptionBase> like(Long id){
        return new CmsApiLikeAction(context,"NewsComment", NewsCommentModel.class).likeContent(id);
    }
    public Observable<ErrorExceptionBase> dislike(Long id){
        return new CmsApiLikeAction(context,"NewsComment", NewsCommentModel.class).dislikeContent(id);
    }
}
