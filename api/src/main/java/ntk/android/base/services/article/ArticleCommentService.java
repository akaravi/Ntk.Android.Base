package ntk.android.base.services.article;

import android.content.Context;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.article.ArticleCommentModel;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.services.base.CmsApiLikeAction;
import ntk.android.base.services.base.CmsApiServerBase;

public class ArticleCommentService extends CmsApiServerBase<ArticleCommentModel, Long> {
    public ArticleCommentService(Context context) {
        super(context, "ArticleComment", ArticleCommentModel.class);
    }
    public Observable<ErrorExceptionBase> like(Long id){
        return new CmsApiLikeAction(context,"ArticleComment", ArticleCommentModel.class).likeContent(id);
    }
    public Observable<ErrorExceptionBase> dislike(Long id){
        return new CmsApiLikeAction(context,"ArticleComment", ArticleCommentModel.class).dislikeContent(id);
    }
}
