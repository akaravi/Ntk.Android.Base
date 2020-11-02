package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntity;

public class MemberPropertyDetailValue extends BaseEntity {
    @SerializedName("LinkPropertyId")
    public Long LinkPropertyId;

    @SerializedName("LinkPropertyDetailId")
    public Long LinkPropertyDetailId;

    @SerializedName("Value")
    public String Value;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkFileId")
    public Long LinkFileId;

    @SerializedName("PropertyDetail")
    public MemberPropertyDetail PropertyDetail;

    @SerializedName("Property")
    public MemberProperty Property;

    @SerializedName("LinkHistoryId")
    public Long LinkHistoryId;

    @SerializedName("virtual_History")
    public MemberHistory virtual_History;

    @SerializedName("History")
    public MemberHistory History;

    @SerializedName("PropertyDetailDefaultValue")
    public List<MemberPropertyDetailDefaultValue> PropertyDetailDefaultValue;

}
