package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BlogContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContent> ListItems;

    @SerializedName("Main")
    public BlogContent Item;
}
