package ntk.android.base.api.object.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntity;

public class ObjectPropertyDetailValue extends BaseEntity {
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
    public ObjectPropertyDetail PropertyDetail;

    @SerializedName("Property")
    public ObjectProperty Property;

    @SerializedName("LinkHistoryId")
    public Long LinkHistoryId;

    @SerializedName("virtual_History")
    public ObjectHistory virtual_History;

    @SerializedName("History")
    public ObjectHistory History;

    @SerializedName("PropertyDetailDefaultValue")
    public List<ObjectPropertyDetailDefaultValue> PropertyDetailDefaultValue;

}
