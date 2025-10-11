package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.entitymodel.blog.BlogCategoryModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BlogCategoryService extends CmsApiServerBase<BlogCategoryModel, Long> {
    public BlogCategoryService(Context context) {
        super(context, "BlogCategory", BlogCategoryModel.class);
    }

}
