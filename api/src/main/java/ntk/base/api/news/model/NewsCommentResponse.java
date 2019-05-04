package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class NewsCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<NewsComment> ListItems;

    @SerializedName("Main")
    public NewsComment Item;
}
