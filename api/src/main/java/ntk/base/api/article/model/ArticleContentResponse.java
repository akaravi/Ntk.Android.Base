package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.model.ArticleContent;
import ntk.base.api.model.ErrorException;

public class ArticleContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContent> ListItems;

    @SerializedName("Item")
    public ArticleContent Item;
}
