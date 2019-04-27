package ntk.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class NewsContentSimilaryListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContetnId;
}
