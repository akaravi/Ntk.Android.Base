package ntk.android.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.blog.entity.BlogCategory;

public class BlogCategoryListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogCategory> ListItems;

    @SerializedName("Item")
    public BlogCategory Item;
}
