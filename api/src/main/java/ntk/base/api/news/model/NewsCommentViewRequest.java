package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class NewsCommentViewRequest{

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;
}
