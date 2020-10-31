package ntk.base.api.hyperShop.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.hyperShop.entity.HyperShopContent;

public class HyperShopContentResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<HyperShopContent> ListItems;

    @SerializedName("Item")
    public HyperShopContent Item;
}
