package ntk.android.base.services.article;

import android.content.Context;

import ntk.android.base.api.article.entity.ArticleCategory;
import ntk.android.base.entitymodel.article.ArticleCategoryModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class ArticleCategoryService extends CmsApiServerBase<ArticleCategoryModel, Long> {
    public ArticleCategoryService(Context context) {
        super(context, "ArticleCategory", ArticleCategoryModel.class);
    }

}
