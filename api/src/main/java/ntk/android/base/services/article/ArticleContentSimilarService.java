package ntk.android.base.services.article;

import android.content.Context;

import ntk.android.base.entitymodel.article.ArticleContentModel;
import ntk.android.base.services.base.CmsApiSimilar;

public  class ArticleContentSimilarService extends CmsApiSimilar<ArticleContentModel, Long> {

    public ArticleContentSimilarService(Context context) {
        super(context, "ArticleContent", ArticleContentModel.class);
    }
}
