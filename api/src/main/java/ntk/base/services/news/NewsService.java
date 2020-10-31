package ntk.base.services.news;
import android.content.Context;
import java.util.Map;
import ntk.base.api.news.entity.NewsContent;
import ntk.base.services.base.CmsApiServerBase;


public class NewsService extends CmsApiServerBase<NewsContent, Long> {


    public NewsService(Context context, Map<String, String> headers) {
        super(context, headers, "NewsContent");
    }


}
