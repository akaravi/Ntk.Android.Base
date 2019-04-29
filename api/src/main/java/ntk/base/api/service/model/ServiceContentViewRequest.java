package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class ServiceContentViewRequest extends FilterModel {

    @SerializedName("Id")
    public long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}
