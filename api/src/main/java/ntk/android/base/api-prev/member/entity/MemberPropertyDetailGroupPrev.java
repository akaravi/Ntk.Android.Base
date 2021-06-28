package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class MemberPropertyDetailGroupPrev extends BaseEntityPrev {

    @SerializedName("Title")
    public String Title ;

    @SerializedName("IconFont")
    public String IconFont ;

    @SerializedName("ShowInFormOrder")
    public Long ShowInFormOrder ;

    @SerializedName("LinkPropertyTypeId")
    public Long LinkPropertyTypeId ;

    @SerializedName("virtual_PropertyType")
    public MemberPropertyTypePrev virtual_PropertyType ;

    @SerializedName("PropertyType")
    public MemberPropertyTypePrev PropertyType ;

    @SerializedName("virtual_PropertyDetails")
    private List<MemberPropertyDetailPrev> virtual_PropertyDetails ;

    @SerializedName("PropertyDetails")
    private List<MemberPropertyDetailPrev> PropertyDetails;
}
