package ntk.base.network;

import android.content.Context;

import java.util.Map;

class NewsService extends BaseService {


    public NewsService(Context context, Map<String, String> headers) {
        super(context, headers, "NewsContent");
    }


}
