package ntk.android.base.services.article;

import android.content.Context;

import ntk.android.base.entitymodel.article.ArticleContentTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class ArticleContentTagService extends CmsApiServerBase<ArticleContentTagModel, Long> {
    public ArticleContentTagService(Context context) {
        super(context, "ArticleContentTag", ArticleContentTagModel.class);
    }
}
