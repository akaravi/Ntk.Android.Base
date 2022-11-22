package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstateCustomerOrderModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("DescriptionHidden")
    public String DescriptionHidden;
    @SerializedName("LinkEstateUserId")
    public String LinkEstateUserId;
    @SerializedName("AreaAddress")
    public String AreaAddress;
    @SerializedName("IncludeAllSite")
    public boolean IncludeAllSite;
    @SerializedName("LinkPropertyIds")
    public List<String> LinkPropertyIds;
    @SerializedName("LinkLocationIds")
    public List<Long> LinkLocationIds;
    @SerializedName("LinkPropertyTypeLanduseId")
    public String LinkPropertyTypeLanduseId;
    @SerializedName("LinkPropertyTypeUsageId")
    public String LinkPropertyTypeUsageId;
    @SerializedName("LinkContractTypeId")
    public String LinkContractTypeId;
    @SerializedName("CreatedYaer")
    public int CreatedYaer;
    @SerializedName("Partition")
    public int Partition;
    @SerializedName("Area")
    public double Area;
    @SerializedName("SalePriceMin")
    public Double SalePriceMin;
    @SerializedName("SalePriceMax")
    public Double SalePriceMax;
    @SerializedName("RentPriceMin")
    public Double RentPriceMin;
    @SerializedName("RentPriceMax")
    public Double RentPriceMax;
    @SerializedName("DepositPriceMin")
    public Double DepositPriceMin;
    @SerializedName("DepositPriceMax")
    public Double DepositPriceMax;
    @SerializedName("PeriodPriceMin")
    public Double PeriodPriceMin;
    @SerializedName("PeriodPriceMax")
    public Double PeriodPriceMax;
    @SerializedName("PropertyDetailValues")
    public List<EstatePropertyDetailValueModel> PropertyDetailValues;
    @SerializedName("PropertyDetailGroups")
    public List<EstatePropertyDetailGroupModel> PropertyDetailGroups;

    @SerializedName("UrlViewContent")
    public String UrlViewContent;
    @SerializedName("UrlViewContentQRCodeBase64")
    public String UrlViewContentQRCodeBase64;
    @SerializedName("LinkCoreCurrencyId")
    public long LinkCoreCurrencyId;
    @SerializedName("CurrencyTitle")
    public String UnitSalePrice = "تومان";
    @SerializedName("CurrencySymbol")
    public String CurrencySymbol = "ت";
    @SerializedName("ContactMobiles")
    public String ContactMobiles;
    @SerializedName("ContactMobileList")
    public List<String> ContactMobileList;
    @SerializedName("LastResultRowCount")
    public int LastResultRowCount;
}
