package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class ProductContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductContent> ListItems;

    @SerializedName("Item")
    public ProductContent Item;
}
