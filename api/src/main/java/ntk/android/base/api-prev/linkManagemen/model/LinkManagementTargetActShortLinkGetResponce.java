package ntk.android.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorExceptionPrev;
import ntk.android.base.api.linkManagemen.entity.LinkManagementTargetActShortLinkGetPrev;


public class LinkManagementTargetActShortLinkGetResponce extends ErrorExceptionPrev {
    @SerializedName("ListItems")
    public List<LinkManagementTargetActShortLinkGetPrev> ListItems;

    @SerializedName("Item")
    public LinkManagementTargetActShortLinkGetPrev Item;
}
