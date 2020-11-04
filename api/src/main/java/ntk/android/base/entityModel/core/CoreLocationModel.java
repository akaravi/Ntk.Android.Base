package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

class CoreLocationModel {
    @SerializedName("title")
    String title;
    @SerializedName("linkParentId")
    Integer linkParentId;
    @SerializedName("linkParentIdNode")
    Long linkParentIdNode;
    @SerializedName("geoLocationLatitude")
    Long geoLocationLatitude;
    @SerializedName("geoLocationLongitude")
    Long geoLocationLongitude;
    @SerializedName("locationType")
    Integer locationType;
    @SerializedName("virtual_Parent")
    Object virtual_Parent;
    @SerializedName("parent")
    Object parent;
    @SerializedName("children")
    Object children;
}
