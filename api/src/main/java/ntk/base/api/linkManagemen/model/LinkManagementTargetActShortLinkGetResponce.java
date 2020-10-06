package ntk.base.api.linkManagemen.model;

import com.google.gson.annotations.SerializedName;

public class LinkManagementTargetActShortLinkGetResponce {
    @SerializedName("Id")
    public long Id;

    @SerializedName("UrlAddress")
    public String UrlAddress;

    @SerializedName("Description")
    public String Description;

    @SerializedName("FileSrc")
    public String FileSrc;
}
