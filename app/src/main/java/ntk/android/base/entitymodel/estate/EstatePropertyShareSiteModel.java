package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyShareSiteModel extends BaseModuleEntity<String> {
    @SerializedName("LinkCmsSiteId")
    public long LinkCmsSiteId;
    @SerializedName("LinkEstatePropertyId")
    public String LinkEstatePropertyId;
}
