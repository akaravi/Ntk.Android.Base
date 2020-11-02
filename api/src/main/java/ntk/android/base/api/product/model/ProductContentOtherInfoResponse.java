package ntk.android.base.api.product.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.product.entity.ProductContentOtherInfo;

public class ProductContentOtherInfoResponse extends ErrorException {

    @SerializedName("ListItems")
    public List<ProductContentOtherInfo> ListItems;

    @SerializedName("Item")
    public ProductContentOtherInfo Item;
}
