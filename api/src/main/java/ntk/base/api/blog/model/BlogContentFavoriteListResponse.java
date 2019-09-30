package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.blog.entity.BlogContent;

public class BlogContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContent> ListItems;

    @SerializedName("Item")
    public BlogContent Item;
}
