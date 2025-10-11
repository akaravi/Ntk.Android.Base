package ntk.android.base.services.news;

import android.content.Context;

import ntk.android.base.entitymodel.news.NewsContentTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class NewsContentTagService extends CmsApiServerBase<NewsContentTagModel, Long> {
    public NewsContentTagService(Context context) {
        super(context, "NewsContentTag", NewsContentTagModel.class);
    }
}
