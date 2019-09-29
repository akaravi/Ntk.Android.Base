package ntk.base.api.object.viewModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.BaseEntity;

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