package ntk.android.base.services.news;

import android.content.Context;

import ntk.android.base.entitymodel.news.NewsTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

class NewsTagService extends CmsApiServerBase<NewsTagModel, Long> {
    public NewsTagService(Context context) {
        super(context, " NewsTag", NewsTagModel.class);
    }
}
