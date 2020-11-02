package ntk.android.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.pooling.entity.PoolingCategory;

public class PoolingCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<PoolingCategory> ListItems;

    @SerializedName("Item")
    public PoolingCategory Item;
}
