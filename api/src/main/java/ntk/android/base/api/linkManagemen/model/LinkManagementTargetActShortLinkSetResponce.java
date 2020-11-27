package ntk.android.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.linkManagemen.entity.LinkManagementTargetActShortLinkSetPrev;

public class LinkManagementTargetActShortLinkSetResponce extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<LinkManagementTargetActShortLinkSetPrev> ListItems;

    @SerializedName("Item")
    public LinkManagementTargetActShortLinkSetPrev Item;

}
