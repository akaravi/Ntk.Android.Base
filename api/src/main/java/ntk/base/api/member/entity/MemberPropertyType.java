package ntk.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class MemberPropertyType extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Description")
    public String Description ;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("PropertyDetails")
    public List<MemberPropertyDetail> PropertyDetails ;

    @SerializedName("virtual_PropertyDetails")
    public List<MemberPropertyDetail> virtual_PropertyDetails ;

    @SerializedName("MemberGroup")
    public List<MemberGroup> memberGroup ;

}
