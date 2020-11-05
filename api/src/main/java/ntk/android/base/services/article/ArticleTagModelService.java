package ntk.android.base.services.article;

import android.content.Context;

import ntk.android.base.entitymodel.article.ArticleTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class ArticleTagModelService extends CmsApiServerBase<ArticleTagModel, Long> {
    public ArticleTagModelService(Context context) {
        super(context, " ArticleTag", ArticleTagModel.class);
    }
}
