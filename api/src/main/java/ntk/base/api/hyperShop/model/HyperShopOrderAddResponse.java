package ntk.base.api.hyperShop.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.hyperShop.entity.HyperShopContent;
import ntk.base.api.hyperShop.entity.HyperShopOrder;

public class HyperShopOrderAddResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<HyperShopOrder> ListItems;

    @SerializedName("Item")
    public HyperShopOrder Item;
}
