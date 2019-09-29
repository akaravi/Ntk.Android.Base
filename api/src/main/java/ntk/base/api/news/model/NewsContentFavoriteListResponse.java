package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.news.viewModel.NewsContent;

public class NewsContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContent> ListItems;

    @SerializedName("Item")
    public NewsContent Item;
}
