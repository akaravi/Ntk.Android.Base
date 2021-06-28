package ntk.android.base.api.hyperShop.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.hyperShop.entity.HyperShopCategoryPrev;

public class HyperShopCategoryResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<HyperShopCategoryPrev> ListItems;

    @SerializedName("Item")
    public HyperShopCategoryPrev Item;
}
