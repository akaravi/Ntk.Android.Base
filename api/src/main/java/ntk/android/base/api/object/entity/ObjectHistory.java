package ntk.android.base.api.object.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntity;

public class ObjectHistory extends BaseEntity {
    @SerializedName("Id")
    public long Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("PropertyDetailValues")
    public List<ObjectPropertyDetailValue> PropertyDetailValues;

    @SerializedName("LinkPropertyId")
    public Long LinkPropertyId;

    @SerializedName("Virtual_Property")
    public ObjectProperty Virtual_Property;

    @SerializedName("Property")
    public ObjectProperty Property;
}