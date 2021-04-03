package ntk.android.base.api.member.model;

import com.google.gson.annotations.SerializedName;

public class MemberPropertyActViewByJoinIdRequest {

    @SerializedName("LinkMemberPropertyId")
    public long LinkMemberPropertyId;

    @SerializedName("LinkMemberUserId")
    public long LinkMemberUserId;

    @SerializedName("JoinId")
    public String JoinId;
}
