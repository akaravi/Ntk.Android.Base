package ntk.android.base.services.news;

import android.content.Context;

import ntk.android.base.entitymodel.news.NewsTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class NewsTagModelService extends CmsApiServerBase<NewsTagModel, Long> {
    public NewsTagModelService(Context context) {
        super(context, " NewsTag", NewsTagModel.class);
    }
}
