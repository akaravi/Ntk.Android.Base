package ntk.base.api.pooling.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.pooling.entity.PoolingCategory;

public class PoolingCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<PoolingCategory> ListItems;

    @SerializedName("Item")
    public PoolingCategory Item;
}
