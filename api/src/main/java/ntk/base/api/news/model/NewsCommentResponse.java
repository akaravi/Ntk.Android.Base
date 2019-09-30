package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.news.entity.NewsComment;

public class NewsCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsComment> ListItems;

    @SerializedName("Item")
    public NewsComment Item;
}
