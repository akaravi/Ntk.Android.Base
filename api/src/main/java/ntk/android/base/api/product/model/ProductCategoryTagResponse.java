package ntk.android.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.product.entity.ProductCategoryTag;

public class ProductCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductCategoryTag> ListItems;

    @SerializedName("Item")
    public ProductCategoryTag Item;
}
