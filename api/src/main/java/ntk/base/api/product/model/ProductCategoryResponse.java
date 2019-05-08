package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ProductCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductCategory> ListItems;

    @SerializedName("Item")
    public ProductCategory Item;
}
