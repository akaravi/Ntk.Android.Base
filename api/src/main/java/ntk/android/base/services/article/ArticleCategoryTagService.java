package ntk.android.base.services.article;

import android.content.Context;

import ntk.android.base.entitymodel.article.ArticleCategoryTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class ArticleCategoryTagService extends CmsApiServerBase<ArticleCategoryTagModel, Long> {
    public ArticleCategoryTagService(Context context) {
        super(context, "ArticleCategoryTag", ArticleCategoryTagModel.class);
    }
}
