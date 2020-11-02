package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.news.entity.NewsContentOtherInfo;

public class NewsContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContentOtherInfo> ListItems;

    @SerializedName("Item")
    public NewsContentOtherInfo Item;
}
