package ntk.android.base.services.news;
import android.content.Context;
import java.util.Map;
import ntk.android.base.api.news.entity.NewsContent;
import ntk.android.base.services.base.CmsApiServerBase;


public class NewsContentService extends CmsApiServerBase<NewsContent, Long> {


    public NewsContentService(Context context) {
        super(context, "NewsContent", NewsContent.class);
    }


}
