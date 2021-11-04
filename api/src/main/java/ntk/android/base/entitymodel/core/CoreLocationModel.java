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
    Double GeoLocationLatitude;
    @SerializedName("GeoLocationLongitude")
    Double GeoLocationLongitude;
    @SerializedName("LocationType")
    Integer LocationType;
    @SerializedName(" virtual_Parent")
    Object  virtual_Parent;
    @SerializedName("Prent")
    Object Parent;
    @SerializedName("Children")
    Object Children;
}
