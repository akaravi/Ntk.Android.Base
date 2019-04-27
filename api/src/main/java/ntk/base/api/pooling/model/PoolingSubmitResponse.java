package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class PoolingSubmitResponse extends ErrorException {

    @SerializedName("Options")
    public List<PoolingOption> options;
}
