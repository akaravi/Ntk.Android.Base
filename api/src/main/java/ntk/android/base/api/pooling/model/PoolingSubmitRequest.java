package ntk.android.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.pooling.entity.PoolingVote;

public class PoolingSubmitRequest {

    @SerializedName("ContentId")
    public Long ContentId;

    @SerializedName("Votes")
    public List<PoolingVote> votes;
}
