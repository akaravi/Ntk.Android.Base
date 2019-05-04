package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BlogContentOtherInfoListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<BlogContentOtherInfo> ListItems;

    @SerializedName("Main")
    public BlogContentOtherInfo Item;
}
