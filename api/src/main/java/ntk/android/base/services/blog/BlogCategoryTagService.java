package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.services.base.CmsApiServerBase;

public class BlogCategoryTagService extends CmsApiServerBase<BlogCategoryTagModel, Long> {
    public BlogCategoryTagService(Context context) {
        super(context, "BlogCategoryTag", BlogCategoryTagModel.class);
    }
}
