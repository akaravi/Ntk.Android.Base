package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstateContractTypeModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("HasSalePrice")
    public boolean HasSalePrice;
    @SerializedName("HasRentPrice")
    public boolean HasRentPrice;
    @SerializedName("HasDepositPrice")
    public boolean HasDepositPrice;
    @SerializedName("UnitSalePrice")
    public String UnitSalePrice;

    @SerializedName("UnitRentPrice")
    public String UnitRentPrice;
    @SerializedName("UnitDepositPrice")
    public String UnitDepositPrice;

    @SerializedName("SalePriceAllowAgreement")
    public boolean SalePriceAllowAgreement;
    @SerializedName("SalePriceMin")
    public Long SalePriceMin;
    @SerializedName("SalePriceMax")
    public Long SalePriceMax;

    @SerializedName("RentPriceAllowAgreement")
    public boolean RentPriceAllowAgreement;
    @SerializedName("RentPriceMin")
    public Long RentPriceMin;
    @SerializedName("RentPriceMax")
    public Long RentPriceMax;

    @SerializedName("DepositPriceAllowAgreement")
    public boolean DepositPriceAllowAgreement;
    @SerializedName("DepositPriceMin")
    public Long DepositPriceMin;
    @SerializedName("DepositPriceMax")
    public Long DepositPriceMax;

    @SerializedName("TitleSalePrice")
    public String TitleSalePrice;
    @SerializedName("TitleDepositPrice")
    public String TitleDepositPrice;
    @SerializedName("TitleRentPrice")
    public String TitleRentPrice;
}
