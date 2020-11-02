package ntk.android.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ErrorException;
import ntk.android.base.api.linkManagemen.entity.LinkManagementTargetActShortLinkGet;


public class LinkManagementTargetActShortLinkGetResponce extends ErrorException {
    @SerializedName("ListItems")
    public List<LinkManagementTargetActShortLinkGet> ListItems;

    @SerializedName("Item")
    public LinkManagementTargetActShortLinkGet Item;
}
