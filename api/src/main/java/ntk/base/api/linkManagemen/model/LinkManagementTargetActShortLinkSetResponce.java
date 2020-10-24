package ntk.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.ErrorException;
import ntk.base.api.linkManagemen.entity.LinkManagementTargetActShortLinkSet;

public class LinkManagementTargetActShortLinkSetResponce extends ErrorException {
    @SerializedName("ListItems")
    public List<LinkManagementTargetActShortLinkSet> ListItems;

    @SerializedName("Item")
    public LinkManagementTargetActShortLinkSet Item;

}
