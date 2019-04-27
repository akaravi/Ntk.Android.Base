package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ArticleCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleCategory> ListItems;

    @SerializedName("Item")
    public ArticleCategory Item;
}
