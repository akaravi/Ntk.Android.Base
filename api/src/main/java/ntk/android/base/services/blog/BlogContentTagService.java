package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.entitymodel.blog.BlogContentTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BlogContentTagService extends CmsApiServerBase<BlogContentTagModel, Long> {
    public BlogContentTagService(Context context) {
        super(context, "BlogContentTag", BlogContentTagModel.class);
    }
}
