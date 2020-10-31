package ntk.base.network;

import android.content.Context;

import java.util.Map;

import ntk.base.api.news.entity.NewsCategory;

public class NewsCategoryService extends BaseService<NewsCategory, Long> {
    public NewsCategoryService(Context context, Map<String, String> headers) {
        super(context,headers, "NewsCategory");
    }

}
