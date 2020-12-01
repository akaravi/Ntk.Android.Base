package ntk.android.base.services.blog;

import android.content.Context;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.blog.BlogCommentModel;
import ntk.android.base.services.base.CmsApiLikeAction;
import ntk.android.base.services.base.CmsApiServerBase;

public class BlogCommentService extends CmsApiServerBase<BlogCommentModel, Long> {
    public BlogCommentService(Context context) {
        super(context, "BlogComment", BlogCommentModel.class);
    }

    public Observable<ErrorExceptionBase> like(Long id) {
        return new CmsApiLikeAction(context, "BlogComment", BlogCommentModel.class).likeContent(id);
    }

    public Observable<ErrorExceptionBase> dislike(Long id) {
        return new CmsApiLikeAction(context, "BlogComment", BlogCommentModel.class).dislikeContent(id);
    }
}
