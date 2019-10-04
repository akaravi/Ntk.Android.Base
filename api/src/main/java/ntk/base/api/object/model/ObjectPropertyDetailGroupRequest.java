package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class ObjectPropertyDetailGroupRequest extends FilterModel {
    @SerializedName("PropertyTypeId")
    public Long PropertyTypeId;
}
