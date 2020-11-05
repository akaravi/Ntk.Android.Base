package ntk.android.base.services.article;

import android.content.Context;

import ntk.android.base.entitymodel.article.ArticleCommentModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class ArticleCommentService extends CmsApiServerBase<ArticleCommentModel, Long> {
    public ArticleCommentService(Context context) {
        super(context, "ArticleComment", ArticleCommentModel.class);
    }
}
