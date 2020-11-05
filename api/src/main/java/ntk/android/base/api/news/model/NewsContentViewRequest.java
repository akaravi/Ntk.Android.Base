package ntk.android.base.api.news.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FilterModel;

public class NewsContentViewRequest extends FilterModel {

    @SerializedName("Id")
    public long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}