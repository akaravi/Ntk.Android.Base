package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopInvoiceSaleDetail extends BaseModuleEntity<Long> {
    @SerializedName("LinkInvoiceSaleId")
    public Long LinkInvoiceSaleId;

    @SerializedName("Virtual_InvoiceSale")
    public ShopInvoiceSale Virtual_InvoiceSale;
    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("LinkContentId")
    public Long LinkContentId;
    @SerializedName("Virtual_Content")
    public ShopContent Virtual_Content;
//    @SerializedName("Content")
    public ShopContent Content;
    @SerializedName("LinkProductItemId")
    public Long LinkProductItemId;
    @SerializedName("Virtual_ProductItem")
    public ShopProductItem Virtual_ProductItem;
    @SerializedName("LinkProductCombineId")
    public Long LinkProductCombineId;
    @SerializedName("Virtual_ProductCombine")
    public ShopProductCombine Virtual_ProductCombine;

    @SerializedName("ProductProcessInputFormEndUserClassJsonFormValues")
    public String ProductProcessInputFormEndUserClassJsonFormValues;

    @SerializedName("LinkProductProcessId")
    public Long LinkProductProcessId;
    @SerializedName("Virtual_ProductProcess")
    public ShopProductProcess Virtual_ProductProcess;

    @SerializedName("LinkProductServiceId")
    public Long LinkProductServiceId;
    @SerializedName("Virtual_ProductService")
    public ShopProductService Virtual_ProductService;

    @SerializedName("Quantity")
    public float Quantity;
    @SerializedName("Fee")
    public float Fee;
    @SerializedName("Tax")
    public float Tax;
    @SerializedName("SumRow")
    public float SumRow;

    @SerializedName("LinkExternalModuleContentId")
    public Long LinkExternalModuleContentId;


    @SerializedName("CreatorIsExternalModule")
    public Boolean CreatorIsExternalModule;

    @SerializedName("Children")
    public ArrayList<ShopInvoiceSaleDetail> Children;
}
