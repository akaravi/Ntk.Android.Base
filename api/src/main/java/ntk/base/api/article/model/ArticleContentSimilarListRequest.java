package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class ArticleContentSimilarListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContetnId;


}
