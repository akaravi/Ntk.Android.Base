package ntk.android.base.api.article.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FilterModel;

public class ArticleContentViewRequest extends FilterModel {

    @SerializedName("Id")
    public long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}
