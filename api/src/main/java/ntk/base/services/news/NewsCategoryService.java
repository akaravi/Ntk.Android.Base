package ntk.base.services.news;

import android.content.Context;

import java.util.Map;

import ntk.base.api.news.entity.NewsCategory;
import ntk.base.api.news.model.NewsContentResponse;
import ntk.base.services.base.CmsApiServerBase;

public class NewsCategoryService extends CmsApiServerBase<NewsCategory, Long> {
    public NewsCategoryService(Context context, Map<String, String> headers) {
        super(context,headers, "NewsCategory");
    }

}
