package ntk.android.base.api.object.model;

import com.google.gson.annotations.SerializedName;

public class ObjectPropertyActViewByJoinIdRequest {

    @SerializedName("LinkMemberPropertyId")
    public long LinkMemberPropertyId;

    @SerializedName("LinkMemberUserId")
    public long LinkMemberUserId;

    @SerializedName("JoinId")
    public String JoinId;
}
