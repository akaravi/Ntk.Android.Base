package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.pooling.entity.PoolingOption;

public class PoolingSubmitResponse extends ErrorException {

    @SerializedName("Options")
    public List<PoolingOption> options;
}
