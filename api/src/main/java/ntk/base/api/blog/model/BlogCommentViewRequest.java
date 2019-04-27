package ntk.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

public class BlogCommentViewRequest {

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;
}
