package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FilterModel;

public class NewsContentSimilarListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}
