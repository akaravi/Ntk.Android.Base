package ntk.base.api.pooling.viewModel;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class PoolingVote extends BaseEntity {
    @SerializedName("OptionId")
    public Long OptionId;

    @SerializedName("OptionScore")
    public int OptionScore;
}
