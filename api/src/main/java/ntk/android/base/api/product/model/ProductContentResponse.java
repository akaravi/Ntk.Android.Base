package ntk.android.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.product.entity.ProductContent;

public class ProductContentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductContent> ListItems;

    @SerializedName("Item")
    public ProductContent Item;
}