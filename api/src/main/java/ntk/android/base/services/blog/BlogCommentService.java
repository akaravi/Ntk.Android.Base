package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.entitymodel.blog.BlogCommentModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BlogCommentService extends CmsApiServerBase<BlogCommentModel, Long> {
    public BlogCommentService(Context context) {
        super(context, "BlogComment", BlogCommentModel.class);
    }
}
