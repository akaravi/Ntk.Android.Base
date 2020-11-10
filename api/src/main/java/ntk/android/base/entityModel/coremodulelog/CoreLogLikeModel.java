package ntk.android.base.entitymodel.coremodulelog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class CoreLogLikeModel extends BaseModuleEntity<String> {


    @SerializedName("moduleName")
    public String moduleName;
    @SerializedName("moduleEntityName")
    public String moduleEntityName;
    @SerializedName("linkUserId")
    public Long linkUserId;
    @SerializedName("linkMemberUserId")
    public Long linkMemberUserId;
    @SerializedName("entityId")
    public long entityId;
    @SerializedName("likked")
    public boolean likked;
    @SerializedName("existBeforAndChangeNow")
    public boolean existBeforAndChangeNow;
}