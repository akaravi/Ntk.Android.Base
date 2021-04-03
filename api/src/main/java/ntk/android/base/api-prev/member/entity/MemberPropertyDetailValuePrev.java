package ntk.android.base.api.member.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class MemberPropertyDetailValuePrev extends BaseEntityPrev {
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
    public MemberPropertyDetailPrev PropertyDetail;

    @SerializedName("Property")
    public MemberPropertyPrev Property;

    @SerializedName("LinkHistoryId")
    public Long LinkHistoryId;

    @SerializedName("virtual_History")
    public MemberHistoryPrev virtual_History;

    @SerializedName("History")
    public MemberHistoryPrev History;

    @SerializedName("PropertyDetailDefaultValue")
    public List<MemberPropertyDetailDefaultValuePrev> PropertyDetailDefaultValue;

}
