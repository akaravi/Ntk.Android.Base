package ntk.android.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.article.entity.ArticleCategory;
import ntk.android.base.api.baseModel.ErrorException;

public class ArticleCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleCategory> ListItems;

    @SerializedName("Item")
    public ArticleCategory Item;
}
