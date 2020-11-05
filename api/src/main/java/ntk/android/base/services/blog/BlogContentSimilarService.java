package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.entitymodel.blog.BlogContentSimilarModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BlogContentSimilarService extends CmsApiServerBase<BlogContentSimilarModel, Long> {
    public BlogContentSimilarService(Context context) {
        super(context, "BlogContentSimilar", BlogContentSimilarModel.class);
    }
}
