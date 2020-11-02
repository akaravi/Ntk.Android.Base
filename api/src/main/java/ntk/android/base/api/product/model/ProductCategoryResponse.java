package ntk.android.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.product.entity.ProductCategory;

public class ProductCategoryResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductCategory> ListItems;

    @SerializedName("Item")
    public ProductCategory Item;
}
