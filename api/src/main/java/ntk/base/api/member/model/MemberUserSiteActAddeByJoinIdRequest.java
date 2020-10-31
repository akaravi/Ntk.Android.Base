package ntk.base.api.member.model;

import com.google.gson.annotations.SerializedName;

public class MemberUserSiteActAddeByJoinIdRequest  {
    @SerializedName("LinkMemberUserId")
    public long LinkMemberUserId;


    @SerializedName("JoinId")
    public String JoinId;
}
