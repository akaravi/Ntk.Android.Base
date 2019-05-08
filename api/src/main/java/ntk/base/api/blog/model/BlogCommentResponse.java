package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BlogCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogComment> ListItems;

    @SerializedName("Item")
    public BlogComment Item;
}
