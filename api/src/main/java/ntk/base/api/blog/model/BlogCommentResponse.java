package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;
import ntk.base.api.news.model.NewsComment;

public class BlogCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogComment> ListItems;

    @SerializedName("Main")
    public NewsComment Item;
}
