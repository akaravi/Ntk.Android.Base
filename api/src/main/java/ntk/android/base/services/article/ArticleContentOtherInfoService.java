package ntk.android.base.services.article;

import android.content.Context;

import ntk.android.base.entitymodel.article.ArticleContentOtherInfoModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class ArticleContentOtherInfoService extends CmsApiServerBase<ArticleContentOtherInfoModel, Long> {
    public ArticleContentOtherInfoService(Context context) {
        super(context, "ArticleContentOtherInfo", ArticleContentOtherInfoModel.class);
    }
}
