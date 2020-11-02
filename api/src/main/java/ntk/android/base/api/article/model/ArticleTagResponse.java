package ntk.android.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.article.entity.ArticleTag;
import ntk.android.base.api.baseModel.ErrorException;

public class ArticleTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleTag> ListItems;

    @SerializedName("Item")
    public ArticleTag Item;
}
