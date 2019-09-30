package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.product.entity.ProductCategory;

public class ProductCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductCategory> ListItems;

    @SerializedName("Item")
    public ProductCategory Item;
}
