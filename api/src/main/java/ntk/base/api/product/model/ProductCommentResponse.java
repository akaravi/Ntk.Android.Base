package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.product.entity.ProductComment;

public class ProductCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductComment> ListItems;

    @SerializedName("Item")
    public ProductComment Item;
}
