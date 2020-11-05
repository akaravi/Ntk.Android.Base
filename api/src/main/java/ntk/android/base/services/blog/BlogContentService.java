package ntk.android.base.services.blog;

import android.content.Context;

import ntk.android.base.api.blog.entity.BlogContent;
import ntk.android.base.services.base.CmsApiServerBase;


public class BlogContentService extends CmsApiServerBase<BlogContent, Long> {


    public BlogContentService(Context context) {
        super(context, "BlogContent", BlogContent.class);
    }


}
