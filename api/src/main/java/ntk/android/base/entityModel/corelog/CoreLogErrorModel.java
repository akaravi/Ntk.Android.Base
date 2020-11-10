package ntk.android.base.entitymodel.corelog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreLogErrorModel extends BaseEntity<String> {

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
    @SerializedName("description")
    public String description;

}
