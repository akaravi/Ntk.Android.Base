package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.entitymodel.blog.BlogTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BlogTagModelService extends CmsApiServerBase<BlogTagModel, Long> {
    public BlogTagModelService(Context context) {
        super(context, " BlogTag", BlogTagModel.class);
    }
}
