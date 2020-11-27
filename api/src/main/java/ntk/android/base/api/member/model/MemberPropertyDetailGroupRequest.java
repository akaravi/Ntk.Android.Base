package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FilterModelPrev;

public class MemberPropertyDetailGroupRequest extends FilterModelPrev {
    @SerializedName("PropertyTypeId")
    public Long PropertyTypeId;
}
