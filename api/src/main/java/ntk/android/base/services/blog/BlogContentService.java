package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.entitymodel.blog.BlogContentModel;
import ntk.android.base.services.base.CmsApiServerBase;


public class BlogContentService extends CmsApiServerBase<BlogContentModel, Long> {


    public BlogContentService(Context context) {
        super(context, "BlogContent", BlogContentModel.class);
    }


}
