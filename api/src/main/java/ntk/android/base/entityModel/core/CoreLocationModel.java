package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

public class CoreLocationModel {
    @SerializedName("Title")
  public   String Title;
    @SerializedName("LinkParentId")
    public  Integer LinkParentId;
    @SerializedName("LinkParentIdNode")
    public  String LinkParentIdNode;
    @SerializedName("GeoLocationLatitude")
    public Double GeoLocationLatitude;
    @SerializedName("GeoLocationLongitude")
    public  Double GeoLocationLongitude;
    @SerializedName("LocationType")
    public   Integer LocationType;
    @SerializedName(" virtual_Parent")
    public   Object  virtual_Parent;
    @SerializedName("Prent")
    public   Object Parent;
    @SerializedName("Children")
    public  Object Children;
}
