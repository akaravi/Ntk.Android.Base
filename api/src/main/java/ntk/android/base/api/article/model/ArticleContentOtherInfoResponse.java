package ntk.android.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.article.entity.ArticleContentOtherInfo;
import ntk.android.base.api.baseModel.ErrorException;

public class ArticleContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ArticleContentOtherInfo> ListItems;

    @SerializedName("Item")
    public ArticleContentOtherInfo Item;
}
