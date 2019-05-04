package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ArticleContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContentOtherInfo> ListItems;

    @SerializedName("Main")
    public ArticleContentOtherInfo Item;
}
