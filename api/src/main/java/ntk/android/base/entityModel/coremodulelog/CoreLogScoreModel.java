package ntk.android.base.entitymodel.coremodulelog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class CoreLogScoreModel extends BaseModuleEntity<String> {

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
    @SerializedName("scorePercent")
    public long scorePercent;

}

