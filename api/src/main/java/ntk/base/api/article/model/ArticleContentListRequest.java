package ntk.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.FilterModel;

public class ArticleContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;


}
