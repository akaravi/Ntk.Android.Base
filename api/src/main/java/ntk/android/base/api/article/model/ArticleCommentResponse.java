package ntk.android.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.article.entity.ArticleComment;
import ntk.android.base.api.baseModel.ErrorException;

public class ArticleCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleComment> ListItems;

    @SerializedName("Item")
    public ArticleComment Item;
}
