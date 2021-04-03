package ntk.android.base.api.hyperShop.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.hyperShop.entity.HyperShopContentPrev;

public class HyperShopContentResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<HyperShopContentPrev> ListItems;

    @SerializedName("Item")
    public HyperShopContentPrev Item;
}
