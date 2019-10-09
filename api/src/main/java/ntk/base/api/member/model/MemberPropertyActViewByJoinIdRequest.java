package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class MemberPropertyActViewByJoinIdRequest {

    @SerializedName("LinkMemberPropertyId")
    public long LinkMemberPropertyId;

    @SerializedName("LinkMemberUserId")
    public long LinkMemberUserId;

    @SerializedName("JoinId")
    public String JoinId;
}
