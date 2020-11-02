package ntk.android.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.blog.entity.BlogCategoryTag;

public class BlogCategoryTagListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogCategoryTag> ListItems;

    @SerializedName("Item")
    public BlogCategoryTag Item;
}
