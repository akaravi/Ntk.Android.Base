package ntk.android.base.api.blog.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FilterModel;

public class BlogContentViewRequest extends FilterModel {

    @SerializedName("Id")
    public long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}
