package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

public class EstatePropertyDetailValueModel {
    @SerializedName("Id")
    public String Id;
    @SerializedName("LinkPropertyDetailId")
    public String LinkPropertyDetailId;
    @SerializedName("PropertyDetail")
    public EstatePropertyDetailModel PropertyDetail;
    @SerializedName("Value")
    public String Value;
    @SerializedName("LinkHistoryId")
    public String LinkHistoryId;
}
