package ntk.android.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.article.entity.ArticleCategoryTag;
import ntk.android.base.api.baseModel.ErrorException;

public class ArticleCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleCategoryTag> ListItems;

    @SerializedName("Item")
    public ArticleCategoryTag Item;
}
