package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstateContractTypeModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("TitleML")
    public String TitleML;
    @SerializedName("TitleResourceLanguage")
    public String TitleResourceLanguage;
    @SerializedName("ContentCount")
    public int ContentCount;
    @SerializedName("TitleSoldIt")
    public String TitleSoldIt;
    @SerializedName("TitleSoldItML")
    public String TitleSoldItML;
    @SerializedName("TitleSoldItResourceLanguage")
    public String TitleSoldItResourceLanguage;
    @SerializedName("Description")
    public String Description;
    @SerializedName("HasSalePrice")
    public boolean HasSalePrice;
    @SerializedName("HasRentPrice")
    public boolean HasRentPrice;
    @SerializedName("HasDepositPrice")
    public boolean HasDepositPrice;
    @SerializedName("HasPeriodPrice")
    public boolean HasPeriodPrice;

    @SerializedName("TitleSalePrice")
    public String TitleSalePrice;
    @SerializedName("TitleSalePriceML")
    public String TitleSalePriceML;
    @SerializedName("TitleSalePriceResourceLanguage")
    public String TitleSalePriceResourceLanguage;

    @SerializedName("TitleRentPrice")
    public String TitleRentPrice;
    @SerializedName("TitleRentPriceML")
    public String TitleRentPriceML;
    @SerializedName("TitleRentPriceResourceLanguage")
    public String TitleRentPriceResourceLanguage;

    @SerializedName("TitleDepositPrice")
    public String TitleDepositPrice;
     @SerializedName("TitleDepositPriceML")
    public String TitleDepositPriceML;
     @SerializedName("titleDepositPriceResourceLanguage")
    public String TitleDepositPriceResourceLanguage;

   @SerializedName("TitlePeriodPrice")
    public String TitlePeriodPrice;
     @SerializedName("TitlePeriodPriceML")
    public String TitlePeriodPriceML;
     @SerializedName("TitlePeriodPriceResourceLanguage")
    public String TitlePeriodPriceResourceLanguage;


    @SerializedName("SalePriceAllowAgreement")
    public boolean SalePriceAllowAgreement;


    @SerializedName("RentPriceAllowAgreement")
    public boolean RentPriceAllowAgreement;
    @SerializedName("RentPriceAllowPriodCount")
    public boolean RentPriceAllowPriodCount;
    @SerializedName("RentPricePriodTitle")
    public String RentPricePriodTitle;
    @SerializedName("RentPricePriodTitleML")
   public String RentPricePriodTitleML;
    @SerializedName("RentPricePriodTitleResourceLanguage")
   public String RentPricePriodTitleResourceLanguage;

    @SerializedName("DepositPriceAllowAgreement")
    public boolean DepositPriceAllowAgreement;
    @SerializedName("PeriodPriceAllowAgreement")
    public boolean PeriodPriceAllowAgreement;




}
