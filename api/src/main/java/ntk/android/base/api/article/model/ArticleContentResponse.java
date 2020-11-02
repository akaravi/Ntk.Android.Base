package ntk.android.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.article.entity.ArticleContent;
import ntk.android.base.api.baseModel.ErrorException;

public class ArticleContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContent> ListItems;

    @SerializedName("Item")
    public ArticleContent Item;
}
