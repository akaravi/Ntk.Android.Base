package ntk.android.base.api.pooling.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

public class PoolingVote extends BaseEntity {
    @SerializedName("OptionId")
    public Long OptionId;

    @SerializedName("OptionScore")
    public int OptionScore;
}
