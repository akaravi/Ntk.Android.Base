package ntk.android.base.services.news;

import android.content.Context;

import java.util.Map;

import ntk.android.base.api.news.entity.NewsCategory;
import ntk.android.base.services.base.CmsApiServerBase;

public class NewsCategoryService extends CmsApiServerBase<NewsCategory, Long> {
    public NewsCategoryService(Context context) {
        super(context, "NewsCategory", NewsCategory.class);
    }

}
