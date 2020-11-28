package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;


public class ShopContent extends BaseModuleEntity<Long> {

    @SerializedName("LinkCategoryId")
    public Long LinkCategoryId;

    @SerializedName("Title")
    public String title;

    @SerializedName("Description")
    public String Description;

    @SerializedName("ProductUnit")
    public String ProductUnit;

    @SerializedName("Price")
    public double Price;

    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;

    @SerializedName("LinkFileIds")
    public String LinkFileIds;

    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;

    @SerializedName("MostSaleSerial")
    public Boolean MostSaleSerial;

    @SerializedName("InvoiceSaleDetails")
    public ArrayList<ShopInvoiceSaleDetail> InvoiceSaleDetails;
    @SerializedName("ProductProductItems")
    public ArrayList<ShopProductProductItem> ProductProductItems;
    @SerializedName("ProductProductCombines")
    public ArrayList<ShopProductProductCombine> ProductProductCombines;
    @SerializedName("ProductProductServices")
    public ArrayList<ShopProductProductService> ProductProductServices;
    @SerializedName("ProductProductProcesses")
    public ArrayList<ShopProductProductProcess> ProductProductProcesses;
    @SerializedName("ProductSalePrices")
    public ArrayList<ShopProductSalePrice> ProductSalePrices;

    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;


}




