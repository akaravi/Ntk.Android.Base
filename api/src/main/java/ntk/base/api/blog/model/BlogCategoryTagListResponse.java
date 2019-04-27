package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BlogCategoryTagListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogCategoryTag> ListItems;

    @SerializedName("Item")
    public BlogCategoryTag Item;
}
