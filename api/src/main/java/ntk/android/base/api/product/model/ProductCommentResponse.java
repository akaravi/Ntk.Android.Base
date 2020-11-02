package ntk.android.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.product.entity.ProductComment;

public class ProductCommentResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductComment> ListItems;

    @SerializedName("Item")
    public ProductComment Item;
}
