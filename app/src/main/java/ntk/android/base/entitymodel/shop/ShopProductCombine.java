package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopProductCombine extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("AddToInvoicePrint")
    public boolean AddToInvoicePrint;
    @SerializedName("CheckInventory")
    public boolean CheckInventory;
    @SerializedName("CurrentInventory")
    public Float CurrentInventory;
    @SerializedName("Price")
    public Float Price;
    @SerializedName("ProductSalePrices")
    public ArrayList<ShopProductSalePrice> ProductSalePrices;
    @SerializedName("InvoiceSaleDetails")
    public ArrayList<ShopInvoiceSaleDetail> InvoiceSaleDetails;
    @SerializedName("ProductProductCombines")
    public ArrayList<ShopProductProductCombine> ProductProductCombines;
    @SerializedName("ProductItemCombines")
    public ArrayList<ShopProductItemCombine> ProductItemCombines;
}
