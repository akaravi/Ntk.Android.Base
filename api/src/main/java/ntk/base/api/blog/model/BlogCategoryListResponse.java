package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BlogCategoryListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogCategory> ListItems;

    @SerializedName("Item")
    public BlogCategory Item;
}
