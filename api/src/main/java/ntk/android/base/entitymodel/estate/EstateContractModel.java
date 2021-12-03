package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstateContractModel extends BaseModuleEntity<String> {
    @SerializedName("Description")
    public String Description;
    @SerializedName("LinkEstateContractTypeId")
    public String LinkEstateContractTypeId;
    @SerializedName("ContractType")
    public EstateContractTypeModel ContractType;
    @SerializedName("LinkPropertyId")
    public String LinkPropertyId;
    @SerializedName("SalePriceByAgreement")
    public boolean SalePriceByAgreement;
    @SerializedName("SalePrice")
    public Double SalePrice;
    @SerializedName("RentPriceByAgreement")
    public Boolean RentPriceByAgreement;
    @SerializedName("RentPrice")
    public Double RentPrice;
    @SerializedName("DepositPriceByAgreement")
    public boolean DepositPriceByAgreement;
    @SerializedName("DepositPrice")
    public Double DepositPrice;
    @SerializedName(" UnitSalePrice")
    public String UnitSalePrice = "تومان";
}
