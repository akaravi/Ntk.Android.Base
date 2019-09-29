package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.pooling.viewModel.PoolingVote;

public class PoolingSubmitRequest {

    @SerializedName("ContentId")
    public Long ContentId;

    @SerializedName("Votes")
    public List<PoolingVote> votes;
}
