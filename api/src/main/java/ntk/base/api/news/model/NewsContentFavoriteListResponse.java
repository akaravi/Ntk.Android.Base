package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class NewsContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsContent> ListItems;

    @SerializedName("Main")
    public NewsContent Item;
}
