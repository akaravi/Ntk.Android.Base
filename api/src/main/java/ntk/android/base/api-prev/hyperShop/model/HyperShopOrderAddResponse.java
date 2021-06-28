package ntk.android.base.api.hyperShop.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.hyperShop.entity.HyperShopOrderPrev;

public class HyperShopOrderAddResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<HyperShopOrderPrev> ListItems;

    @SerializedName("Item")
    public HyperShopOrderPrev Item;
}
