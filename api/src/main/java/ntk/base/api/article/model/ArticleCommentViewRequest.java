package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ArticleCommentViewRequest{

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;
}
