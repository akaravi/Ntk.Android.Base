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
    @SerializedName("CurrencyTitle")
    public String UnitSalePrice = "تومان";
    @SerializedName("CurrencySymbol")
    public String CurrencySymbol = "ت";
    @SerializedName("PeriodPriceByAgreement")
    public boolean PeriodPriceByAgreement;
    @SerializedName("PeriodPrice")
    public Double PeriodPrice;
//    @SerializedName("PeriodCount")
//    public int PeriodCount;
    @SerializedName("LinkCoreCurrencyId")
    public long LinkCoreCurrencyId;
}
