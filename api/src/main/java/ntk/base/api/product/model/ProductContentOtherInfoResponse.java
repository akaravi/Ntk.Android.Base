package ntk.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.product.entity.ProductContentOtherInfo;

public class ProductContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductContentOtherInfo> ListItems;

    @SerializedName("Item")
    public ProductContentOtherInfo Item;
}
