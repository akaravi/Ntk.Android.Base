package ntk.android.base.api.hyperShop.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.hyperShop.entity.HyperShopContent;

public class HyperShopContentResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<HyperShopContent> ListItems;

    @SerializedName("Item")
    public HyperShopContent Item;
}
