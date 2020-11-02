package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntity;

public class MemberPropertyDetailGroup extends BaseEntity {

    @SerializedName("Title")
    public String Title ;

    @SerializedName("IconFont")
    public String IconFont ;

    @SerializedName("ShowInFormOrder")
    public Long ShowInFormOrder ;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId ;

    @SerializedName("virtual_PropertyType")
    public MemberPropertyType virtual_PropertyType ;

    @SerializedName("PropertyType")
    public MemberPropertyType PropertyType ;

    @SerializedName("virtual_PropertyDetails")
    private List<MemberPropertyDetail> virtual_PropertyDetails ;

    @SerializedName("PropertyDetails")
    private List<MemberPropertyDetail> PropertyDetails;
}
