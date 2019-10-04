package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class ObjectPropertyActViewByJoinIdRequest {

    @SerializedName("LinkMemberPropertyId")
    public long LinkMemberPropertyId;

    @SerializedName("LinkMemberUserId")
    public long LinkMemberUserId;

    @SerializedName("JoinId")
    public String JoinId;
}
