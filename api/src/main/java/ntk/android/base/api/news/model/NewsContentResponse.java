package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.news.entity.NewsContent;
import ntk.android.base.api.baseModel.ErrorException;

public class NewsContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContent> ListItems;

    @SerializedName("Item")
    public NewsContent Item;
}