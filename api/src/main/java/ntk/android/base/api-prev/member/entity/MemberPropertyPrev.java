package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class MemberPropertyPrev extends BaseEntityPrev {
    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkMemberUserId")
    public Long LinkMemberUserId;
    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description;
    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId;

    @SerializedName("virtual_MemberUser")
    public MemberUserPrev virtual_MemberUser;

    @SerializedName("MemberUser")
    public MemberUserPrev MemberUser;

    @SerializedName("virtual_PropertyType")
    public MemberPropertyTypePrev virtual_PropertyType;
    @SerializedName("PropertyType")
    public MemberPropertyTypePrev PropertyType;


    @SerializedName("Address")
    public String Address;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkExtraImageIds")
    public String LinkExtraImageIds;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("SumLikeClick")
    public int SumLikeClick;

    @SerializedName("SumLikeScore")
    public int SumLikeScore;

    @SerializedName("ViewCount")
    public int ViewCount;


    @SerializedName("Histores")
    public List<MemberHistoryPrev> Histores;
    @SerializedName("virtual_PropertyDetailValue")
    public List<MemberPropertyDetailValuePrev> virtual_PropertyDetailValue;

    @SerializedName("PropertyDetailValue")
    public List<MemberPropertyDetailValuePrev> PropertyDetailValue;

    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;

    @SerializedName("LinkExtraImageIdsSrc")
    public List<String> LinkExtraImageIdsSrc;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;

}
