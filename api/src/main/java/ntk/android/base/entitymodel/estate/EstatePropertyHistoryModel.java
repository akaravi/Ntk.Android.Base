package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyHistoryModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("LinkPropertyId")
    public String LinkPropertyId;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
}
