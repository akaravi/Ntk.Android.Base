package ntk.android.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

public class EstateContractPrev {
    @SerializedName("Id")
    public String Id;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkEstateContractTypeId")
    public String LinkEstateContractTypeId;

    @SerializedName("ContractType")
    public EstateContractType ContractType;

    @SerializedName("LinkPropertyId")
    public String LinkPropertyId;

    @SerializedName("LinkPropertyId")
    public Double SalePrice;

    @SerializedName("LinkPropertyId")
    public Double RentPrice;

    @SerializedName("LinkPropertyId")
    public Double DepositPrice;

}
