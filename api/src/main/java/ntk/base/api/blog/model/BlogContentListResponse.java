package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.blog.viewModel.BlogContent;

public class BlogContentListResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<BlogContent> ListItems;

    @SerializedName("Item")
    public BlogContent Item;
}
