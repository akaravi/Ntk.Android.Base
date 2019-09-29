package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

public class NewsCommentViewRequest{

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;
}
