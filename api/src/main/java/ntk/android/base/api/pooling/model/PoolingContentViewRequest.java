package ntk.android.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

public class PoolingContentViewRequest {

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}
