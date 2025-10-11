package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyShareAgencyModel extends BaseModuleEntity<String> {
    @SerializedName("LinkEstateAgencyId")
    public String LinkEstateAgencyId;
    @SerializedName("LinkEstatePropertyId")
    public String LinkEstatePropertyId;
}
