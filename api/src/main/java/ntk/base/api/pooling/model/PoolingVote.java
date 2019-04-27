package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

public class PoolingVote extends BaseEntity {
    @SerializedName("OptionId")
    public Long OptionId;

    @SerializedName("OptionScore")
    public int OptionScore;
}
