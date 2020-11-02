package ntk.android.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.linkManagemen.entity.LinkManagementTarget;

public class HyperShopCategoryResponse extends ErrorException {
    @SerializedName("ListItems")
    public List<LinkManagementTarget> ListItems;

    @SerializedName("Item")
    public LinkManagementTarget Item;
}
