package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.entity.ArticleTag;
import ntk.base.api.baseModel.ErrorException;

public class ArticleTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleTag> ListItems;

    @SerializedName("Item")
    public ArticleTag Item;
}
