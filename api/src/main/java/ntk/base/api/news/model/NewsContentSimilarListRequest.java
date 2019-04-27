package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class NewsContentSimilarListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}
