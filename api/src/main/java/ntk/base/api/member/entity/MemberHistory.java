package ntk.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

public class MemberHistory extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("PropertyDetailValues")
    public List<MemberPropertyDetailValue> PropertyDetailValues;

    @SerializedName("LinkPropertyId")
    public Long LinkPropertyId;

    @SerializedName("Virtual_Property")
    public MemberProperty Virtual_Property;

    @SerializedName("Property")
    public MemberProperty Property;
}