package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ArticleTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleTag> ListItems;

    @SerializedName("Main")
    public ArticleTag Item;
}
