package ntk.android.base.entityModel.core;

import com.google.gson.annotations.SerializedName;

class CoreLocationModel {
    @SerializedName("")  String title;
    @SerializedName("")  Integer linkParentId;
    @SerializedName("")  Long linkParentIdNode;
    @SerializedName("")   Long geoLocationLatitude;
    @SerializedName("")  Long geoLocationLongitude;
    @SerializedName("")   Integer locationType;
    @SerializedName("")   Object virtual_Parent;
    @SerializedName("")    Object parent;
    @SerializedName("")  Object children;
}
