package ntk.android.base.services.news;

import android.content.Context;

import ntk.android.base.entitymodel.news.NewsContentOtherInfoModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class NewsContentOtherInfoService extends CmsApiServerBase<NewsContentOtherInfoModel, Long> {
    public NewsContentOtherInfoService(Context context) {
        super(context, "NewsContentOtherInfo", NewsContentOtherInfoModel.class);
    }
}
