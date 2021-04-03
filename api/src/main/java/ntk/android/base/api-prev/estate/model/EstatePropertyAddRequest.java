package ntk.android.base.api.estate.model;

import com.google.gson.annotations.SerializedName;

public class EstatePropertyAddRequest {

    @SerializedName("Latitude")
    public double Latitude;

    @SerializedName("Longitude")
    public double Longitude;

    @SerializedName("EstateContractType")
    public int EstateContractType;

    @SerializedName("EstatePropertyType")
    public int EstatePropertyType;

    @SerializedName("Title")
    public String Title;

    @SerializedName("Address")
    public String Address;

    @SerializedName("Description")
    public String Description;

    @SerializedName("SalePrice")
    public Long SalePrice;

    @SerializedName("PresalePrice")
    public Long PresalePrice;

    @SerializedName("RentPrice")
    public Long RentPrice;
    @SerializedName("DepositPrice")
    public Long DepositPrice;

    @SerializedName("InputValue") //TODO >>> type
    public Long InputValue;

    @SerializedName("fileStream") //TODO >>> type
    public Long fileStream;
}
