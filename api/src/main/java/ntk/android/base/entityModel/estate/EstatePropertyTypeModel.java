package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyTypeModel extends BaseModuleEntity<String> {
    @SerializedName("LinkPropertyTypeLanduseId")
    public String LinkPropertyTypeLanduseId;
    @SerializedName("LinkPropertyTypeUsageId")
    public String LinkPropertyTypeUsageId;
    @SerializedName("PropertyTypeLanduse")
    EstatePropertyTypeLanduseModel PropertyTypeLanduse;
    @SerializedName("PropertyTypeUsage")
    EstatePropertyTypeUsageModel PropertyTypeUsage;
}
