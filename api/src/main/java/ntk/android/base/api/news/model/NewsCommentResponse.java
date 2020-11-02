package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.news.entity.NewsComment;

public class NewsCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsComment> ListItems;

    @SerializedName("Item")
    public NewsComment Item;
}
