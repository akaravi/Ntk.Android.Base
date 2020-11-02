package ntk.android.base.api.object.entity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

import ntk.android.base.api.baseModel.BaseEntity;


public class ObjectUser extends BaseEntity {
    @SerializedName("Id")
    public long Id;


    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description;

    @SerializedName("JoinId")
    public String JoinId;

    @SerializedName("LinkLocationId")
    public Long LinkLocationId;
    /// <summary>
    /// موقعیت جغرافیایی
    /// </summary>
    @SerializedName("Geolocationlatitude")
    public Double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;

    @SerializedName("DateManufacture")
    public String DateManufacture;

    @SerializedName("PlaceProduction")
    public String PlaceProduction;

    @SerializedName("SerialRfId")
    public String SerialRfId;

    @SerializedName("SerialNumber")
    public String SerialNumber;

    @SerializedName("Address")
    public String Address;

    @SerializedName("ObjectUserGroup")
    public List<ObjectUserGroup> ObjectUserGroup;

    @SerializedName("ObjectPropertes")
    public List<ObjectProperty> ObjectPropertes;

    @SerializedName("ObjectUserSites")
    public List<ObjectUserSite> ObjectUserSites;
}
