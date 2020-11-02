package ntk.android.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.blog.entity.BlogContent;

public class BlogContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContent> ListItems;

    @SerializedName("Item")
    public BlogContent Item;
}
