package ntk.android.base.services.article;

import android.content.Context;

import ntk.android.base.api.article.entity.ArticleContent;
import ntk.android.base.services.base.CmsApiServerBase;


public class ArticleContentService extends CmsApiServerBase<ArticleContent, Long> {


    public ArticleContentService(Context context) {
        super(context, "ArticleContent", ArticleContent.class);
    }


}
