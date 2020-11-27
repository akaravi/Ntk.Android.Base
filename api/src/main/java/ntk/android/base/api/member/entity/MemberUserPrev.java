package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntityPrev;


public class MemberUserPrev extends BaseEntityPrev {
    @SerializedName("Id")
    public long Id;


    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkDeviceId")
    public String LinkDeviceId;

    @SerializedName("JoinId")
    public String JoinId;

    @SerializedName("Gender")
    public Long Gender;

    @SerializedName("FirstName")
    public String FirstName;

    @SerializedName("LastName")
    public String LastName;

    @SerializedName("LinkLocationId")
    public Long LinkLocationId;


    @SerializedName("DateBirth")
    public String DateBirth;

    @SerializedName("BirthPlace")
    public String BirthPlace;

    @SerializedName("NationalCode")
    public String NationalCode;

    @SerializedName("Email")
    public String Email;

    @SerializedName("MobileNo")
    public String MobileNo;


    @SerializedName("PhoneNo")
    public String PhoneNo;

    @SerializedName("OfficeNo")
    public String OfficeNo;


    @SerializedName("Address")
    public String Address;


    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;



    @SerializedName("Geolocationlatitude")
    public Double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;



    @SerializedName("InstagramId")
    public String InstagramId;

    @SerializedName("TelegramId")
    public String TelegramId;

    @SerializedName("OtherInfo1")
    public String OtherInfo1;

    @SerializedName("OtherInfo2")
    public String OtherInf2;

    @SerializedName("OtherInfo3")
    public String OtherInfo3;

    @SerializedName("OtherInfo4")
    public String OtherInfo4;

    @SerializedName("OtherInfo5")
    public String OtherInfo5;

    @SerializedName("OtherInfo6")
    public String OtherInfo6;

    @SerializedName("OtherInfo7")
    public String OtherInfo7;

    @SerializedName("OtherInfo8")
    public String OtherInfo8;

    @SerializedName("OtherInfo9")
    public String OtherInfo9;

    @SerializedName("OtherInfo10")
    public String OtherInfo10;





    @SerializedName("MemberUserGroup")
    public List<MemberUserGroupPrev> MemberUserGroup;

    @SerializedName("MemberPropertes")
    public List<MemberPropertyPrev> MemberPropertes;

    @SerializedName("MemberUserSites")
    public List<MemberUserSitePrev> MemberUserSites;
}
