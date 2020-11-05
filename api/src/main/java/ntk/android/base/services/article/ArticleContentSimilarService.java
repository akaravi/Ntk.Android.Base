package ntk.android.base.services.article;

import android.content.Context;

import ntk.android.base.entitymodel.article.ArticleContentSimilarModel;
import ntk.android.base.services.base.CmsApiServerBase;

public  class ArticleContentSimilarService extends CmsApiServerBase<ArticleContentSimilarModel, Long> {
    public ArticleContentSimilarService(Context context) {
        super(context, "ArticleContentSimilar", ArticleContentSimilarModel.class);
    }
}
