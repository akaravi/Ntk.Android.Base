package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.ErrorException;

public class PoolingContentViewResponse extends ErrorException {

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}
