package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class MemberHistoryPrev extends BaseEntityPrev {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("PropertyDetailValues")
    public List<MemberPropertyDetailValuePrev> PropertyDetailValues;

    @SerializedName("LinkPropertyId")
    public Long LinkPropertyId;

    @SerializedName("Virtual_Property")
    public MemberPropertyPrev Virtual_Property;

    @SerializedName("Property")
    public MemberPropertyPrev Property;
}