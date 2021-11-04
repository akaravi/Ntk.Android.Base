package ntk.android.base.entitymodel.corelog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreLogErrorModel extends BaseEntity<String> {

    @SerializedName("ModuleName")
    public String ModuleName;
    @SerializedName("ModuleEntityName")
    public String ModuleEntityName;
    @SerializedName("LinkUserId")
    public Long LinkUserId;
    @SerializedName("LinkMemberUserId")
    public Long LinkMemberUserId;
    @SerializedName("EntityId")
    public long EntityId;
    @SerializedName("Description")
    public String Description;

}
