package ntk.android.base.services.news;

import android.content.Context;

import ntk.android.base.entitymodel.news.NewsCommentModel;
import ntk.android.base.services.base.CmsApiServerBase;

class NewsCommentService extends CmsApiServerBase<NewsCommentModel, Long> {
    public NewsCommentService(Context context) {
        super(context, "NewsComment", NewsCommentModel.class);
    }
}
