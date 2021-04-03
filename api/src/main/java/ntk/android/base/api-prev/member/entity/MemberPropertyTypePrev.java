package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class MemberPropertyTypePrev extends BaseEntityPrev {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description ;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("PropertyDetails")
    public List<MemberPropertyDetailPrev> PropertyDetails ;

    @SerializedName("virtual_PropertyDetails")
    public List<MemberPropertyDetailPrev> virtual_PropertyDetails ;

    @SerializedName("MemberGroup")
    public List<MemberGroupPrev> memberGroup ;

}
