package ntk.android.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.blog.entity.BlogContentOtherInfo;

public class BlogContentOtherInfoListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentOtherInfo> ListItems;

    @SerializedName("Item")
    public BlogContentOtherInfo Item;
}
