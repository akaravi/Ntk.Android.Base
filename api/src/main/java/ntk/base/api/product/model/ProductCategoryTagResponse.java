package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ProductCategoryTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductCategoryTag> ListItems;

    @SerializedName("Main")
    public ProductCategoryTag Item;
}
