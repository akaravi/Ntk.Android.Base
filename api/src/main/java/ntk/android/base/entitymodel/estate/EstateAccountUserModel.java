package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstateAccountUserModel extends BaseModuleEntity<String> {
    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("JoinId")
    public String JoinId;
    @SerializedName("LinkLocationId")
    public int LinkLocationId;
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
    @SerializedName("PhoneNumber")
    public String PhoneNumber;

    @SerializedName("Address")
    public String Address;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
}
