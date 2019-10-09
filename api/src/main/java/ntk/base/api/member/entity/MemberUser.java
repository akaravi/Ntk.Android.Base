package ntk.base.api.member.entity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

import ntk.base.api.baseModel.BaseEntity;


public class MemberUser extends BaseEntity {
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

    @SerializedName("MemberUserGroup")
    public List<MemberUserGroup> MemberUserGroup;

    @SerializedName("MemberPropertes")
    public List<MemberProperty> MemberPropertes;

    @SerializedName("MemberUserSites")
    public List<MemberUserSite> MemberUserSites;
}
