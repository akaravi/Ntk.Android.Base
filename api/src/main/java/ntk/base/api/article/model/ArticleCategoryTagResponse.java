package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.viewModel.ArticleCategoryTag;
import ntk.base.api.baseModel.ErrorException;

public class ArticleCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleCategoryTag> ListItems;

    @SerializedName("Item")
    public ArticleCategoryTag Item;
}
