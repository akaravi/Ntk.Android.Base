package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyShareAgentModel extends BaseModuleEntity<String> {
    @SerializedName("LinkEstateAgentId")
    public String LinkEstateAgentId;
    @SerializedName("LinkEstatePropertyId")
    public String LinkEstatePropertyId;
}
