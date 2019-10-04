package ntk.base.api.object.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.FilterModel;

public class ObjectUserSiteActAddeByJoinIdRequest  {
    @SerializedName("LinkObjectUserId")
    public long LinkObjectUserId;


    @SerializedName("JoinId")
    public String JoinId;
}
