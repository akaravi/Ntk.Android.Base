package ntk.android.base.api.hyperShop.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.hyperShop.entity.HyperShopOrder;

public class HyperShopOrderAddResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<HyperShopOrder> ListItems;

    @SerializedName("Item")
    public HyperShopOrder Item;
}
