package ntk.android.base.api.hyperShop.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.hyperShop.entity.HyperShopCategory;

public class HyperShopCategoryResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<HyperShopCategory> ListItems;

    @SerializedName("Item")
    public HyperShopCategory Item;
}
