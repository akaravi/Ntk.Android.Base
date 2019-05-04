package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ProductTagResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductTag> ListItems;

    @SerializedName("Main")
    public ProductTag Item;
}
