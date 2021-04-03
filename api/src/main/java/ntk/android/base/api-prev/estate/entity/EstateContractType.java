package ntk.android.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntityPrev;

public class EstateContractType extends BaseEntityPrev {
//    نوع معامله (اجاره رهن فروش)

    @SerializedName("Id")
    public String Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("HasSalePrice")
    public Boolean HasSalePrice;

    @SerializedName("HasRentPrice")
    public Boolean HasRentPrice;

    @SerializedName("HasDepositPrice")
    public Boolean HasDepositPrice;


    @SerializedName("UnitSalePrice")
    public Boolean UnitSalePrice;

    @SerializedName("UnitRentPrice")
    public Boolean UnitRentPrice;

    @SerializedName("UnitDepositPrice")
    public Boolean UnitDepositPrice;


    @SerializedName("SalePriceMin")
    public int SalePriceMin;
    @SerializedName("SalePriceMax")
    public int SalePriceMax;

    @SerializedName("RentPriceMin")
    public int RentPriceMin;
    @SerializedName("RentPriceMax")
    public int RentPriceMax;

    @SerializedName("DepositPriceMin")
    public int DepositPriceMin;
    @SerializedName("SalePriceMax")
    public int DepositPriceMax;
}
