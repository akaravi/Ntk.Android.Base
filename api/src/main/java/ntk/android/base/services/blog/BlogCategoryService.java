package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.api.blog.entity.BlogCategory;
import ntk.android.base.services.base.CmsApiServerBase;

public class BlogCategoryService extends CmsApiServerBase<BlogCategory, Long> {
    public BlogCategoryService(Context context) {
        super(context, "BlogCategory", BlogCategory.class);
    }

}
