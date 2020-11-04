package ntk.android.base.services.news;

import android.content.Context;

import ntk.android.base.entitymodel.news.NewsContentSimilarModel;
import ntk.android.base.services.base.CmsApiServerBase;

class NewsContentSimilarService extends CmsApiServerBase<NewsContentSimilarModel, Long> {
    public NewsContentSimilarService(Context context) {
        super(context, "NewsContentSimilar", NewsContentSimilarModel.class);
    }
}
