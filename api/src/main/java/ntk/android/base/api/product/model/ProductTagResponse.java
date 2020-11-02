package ntk.android.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.product.entity.ProductTag;

public class ProductTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductTag> ListItems;

    @SerializedName("Item")
    public ProductTag Item;
}
