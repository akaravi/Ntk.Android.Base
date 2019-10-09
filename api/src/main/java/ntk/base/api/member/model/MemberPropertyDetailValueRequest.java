package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class MemberPropertyDetailValueRequest extends FilterModel {
    @SerializedName("PropertyTypeId")
    public Long PropertyTypeId;
}
