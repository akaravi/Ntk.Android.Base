package ntk.android.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.pooling.entity.PoolingOption;

public class PoolingSubmitResponse extends ErrorException {

    @SerializedName("Options")
    public List<PoolingOption> options;
}
