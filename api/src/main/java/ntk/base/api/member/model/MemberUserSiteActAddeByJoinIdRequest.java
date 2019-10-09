package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class MemberUserSiteActAddeByJoinIdRequest  {
    @SerializedName("LinkMemberUserId")
    public long LinkMemberUserId;


    @SerializedName("JoinId")
    public String JoinId;
}
