package ntk.android.base.api.article.model;

import com.google.gson.annotations.SerializedName;

public class ArticleCommentViewRequest{

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;
}
