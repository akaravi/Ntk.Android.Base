package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.article.viewModel.ArticleContentOtherInfo;
import ntk.base.api.baseModel.ErrorException;

public class ArticleContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContentOtherInfo> ListItems;

    @SerializedName("Item")
    public ArticleContentOtherInfo Item;
}
