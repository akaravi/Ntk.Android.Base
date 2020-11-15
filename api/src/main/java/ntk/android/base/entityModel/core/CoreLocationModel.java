package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

public class CoreLocationModel {
    @SerializedName("Title")
    String Title;
    @SerializedName("LinkParentId")
    Integer LinkParentId;
    @SerializedName("LinkParentIdNode")
    Long LinkParentIdNode;
    @SerializedName("GeoLocationLatitude")
    Long GeoLocationLatitude;
    @SerializedName("GeoLocationLongitude")
    Long GeoLocationLongitude;
    @SerializedName("LocationType")
    Integer LocationType;
    @SerializedName("Virtual_Parent")
    Object Virtual_Parent;
    @SerializedName("Prent")
    Object Parent;
    @SerializedName("Children")
    Object Children;
}
