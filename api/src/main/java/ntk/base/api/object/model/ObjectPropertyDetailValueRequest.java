package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class ObjectPropertyDetailValueRequest extends FilterModel {
    @SerializedName("PropertyTypeId")
    public Long PropertyTypeId;
}
