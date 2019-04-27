package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class BiographyContentViewRequest extends FilterModel {

    @SerializedName("Id")
    public long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}
