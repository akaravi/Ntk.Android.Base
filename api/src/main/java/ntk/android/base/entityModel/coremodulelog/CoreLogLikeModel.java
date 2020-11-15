package ntk.android.base.entitymodel.coremodulelog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class CoreLogLikeModel extends BaseModuleEntity<String> {


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
    @SerializedName("Likked")
    public boolean Likked;
    @SerializedName("ExistBeforAndChangeNow")
    public boolean ExistBeforAndChangeNow;
}
