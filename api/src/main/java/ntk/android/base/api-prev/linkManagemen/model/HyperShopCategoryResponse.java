package ntk.android.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.linkManagemen.entity.LinkManagementTargetPrev;

public class HyperShopCategoryResponse extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<LinkManagementTargetPrev> ListItems;

    @SerializedName("Item")
    public LinkManagementTargetPrev Item;
}
