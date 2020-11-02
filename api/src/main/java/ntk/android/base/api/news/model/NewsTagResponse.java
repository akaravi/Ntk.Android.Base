package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.news.entity.NewsTag;

public class NewsTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsTag> ListItems;

    @SerializedName("Item")
    public NewsTag Item;
}
