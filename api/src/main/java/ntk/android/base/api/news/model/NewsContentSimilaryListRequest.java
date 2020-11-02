package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FilterModel;

public class NewsContentSimilaryListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContetnId;
}
