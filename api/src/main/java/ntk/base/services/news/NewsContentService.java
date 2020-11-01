package ntk.base.services.news;
import android.content.Context;
import java.util.Map;
import ntk.base.api.news.entity.NewsContent;
import ntk.base.api.news.model.NewsContentResponse;
import ntk.base.dtoModel.news.NewsContentResponceModel;
import ntk.base.services.base.CmsApiServerBase;


public class NewsContentService extends CmsApiServerBase<NewsContent, Long> {


    public NewsContentService(Context context, Map<String, String> headers) {
        super(context, headers, "NewsContent");
    }


}
