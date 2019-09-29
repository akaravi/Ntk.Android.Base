package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.news.viewModel.NewsTag;

public class NewsTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsTag> ListItems;

    @SerializedName("Item")
    public NewsTag Item;
}
