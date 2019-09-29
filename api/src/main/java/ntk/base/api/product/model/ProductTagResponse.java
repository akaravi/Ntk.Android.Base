package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.product.viewModel.ProductTag;

public class ProductTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductTag> ListItems;

    @SerializedName("Item")
    public ProductTag Item;
}
