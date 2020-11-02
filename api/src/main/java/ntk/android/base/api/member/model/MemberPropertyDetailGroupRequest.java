package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FilterModel;

public class MemberPropertyDetailGroupRequest extends FilterModel {
    @SerializedName("PropertyTypeId")
    public Long PropertyTypeId;
}
