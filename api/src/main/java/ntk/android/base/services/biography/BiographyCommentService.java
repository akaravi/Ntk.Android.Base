package ntk.android.base.services.biography;

import android.content.Context;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.biography.BiographyCommentModel;
import ntk.android.base.services.base.CmsApiLikeAction;
import ntk.android.base.services.base.CmsApiServerBase;

public class BiographyCommentService extends CmsApiServerBase<BiographyCommentModel, Long> {
    public BiographyCommentService(Context context) {
        super(context, "BiographyComment", BiographyCommentModel.class);
    }

    public Observable<ErrorExceptionBase> like(Long id){
        return new CmsApiLikeAction(context,"BiographyComment", BiographyCommentModel.class).likeContent(id);
    }
    public Observable<ErrorExceptionBase> dislike(Long id){
        return new CmsApiLikeAction(context,"BiographyComment", BiographyCommentModel.class).dislikeContent(id);
    }
}
