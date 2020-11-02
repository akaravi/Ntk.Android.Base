package ntk.android.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.pooling.entity.PoolingContent;

public class PoolingContentListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<PoolingContent> ListItems;

    @SerializedName("Item")
    public PoolingContent Item;
}
