package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.entitymodel.blog.BlogContentOtherInfoModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BlogContentOtherInfoService extends CmsApiServerBase<BlogContentOtherInfoModel, Long> {
    public BlogContentOtherInfoService(Context context) {
        super(context, "BlogContentOtherInfo", BlogContentOtherInfoModel.class);
    }
}
