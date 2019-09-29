package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.product.viewModel.ProductCategoryTag;

public class ProductCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductCategoryTag> ListItems;

    @SerializedName("Item")
    public ProductCategoryTag Item;
}
