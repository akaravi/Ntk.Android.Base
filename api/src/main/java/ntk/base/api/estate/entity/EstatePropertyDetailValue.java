package ntk.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

public class EstatePropertyDetailValue {

    @SerializedName("Id")
    public String Id;

    @SerializedName("LinkPropertyDetailId")
    public String LinkPropertyDetailId;

    @SerializedName("PropertyDetail")
    public EstatePropertyDetail PropertyDetail;

    @SerializedName("Value")
    public String Value;

    @SerializedName("LinkHistoryId")
    public String LinkHistoryId;
}
