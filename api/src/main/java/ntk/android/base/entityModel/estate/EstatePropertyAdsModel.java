package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyAdsModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("StationLevel")
    public long StationLevel;
    @SerializedName("ViewLevel")
    public long ViewLevel;
    @SerializedName("LinkPropertyId")
    public String LinkPropertyId;
    @SerializedName("FromDate")
    public String FromDate;
    @SerializedName("ExpireDate")
    public String ExpireDate;
}
