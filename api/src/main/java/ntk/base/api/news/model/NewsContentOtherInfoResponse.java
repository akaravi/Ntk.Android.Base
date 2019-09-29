package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.news.viewModel.NewsContentOtherInfo;

public class NewsContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContentOtherInfo> ListItems;

    @SerializedName("Item")
    public NewsContentOtherInfo Item;
}
