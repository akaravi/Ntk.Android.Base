package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FilterModel;

public class ObjectPropertyDetailGroupRequest extends FilterModel {
    @SerializedName("PropertyTypeId")
    public Long PropertyTypeId;
}
