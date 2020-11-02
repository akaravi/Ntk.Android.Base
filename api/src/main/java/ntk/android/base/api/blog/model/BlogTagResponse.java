package ntk.android.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.blog.entity.BlogTag;

public class BlogTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogTag> ListItems;

    @SerializedName("Item")
    public BlogTag Item;
}
