package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.product.entity.ProductContent;

public class ProductContentFavoriteListResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductContent> ListItems;

    @SerializedName("Item")
    public ProductContent Item;
}
