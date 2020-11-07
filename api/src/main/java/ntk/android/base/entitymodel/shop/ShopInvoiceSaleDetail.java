package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopInvoiceSaleDetail extends BaseModuleEntity<Long> {
    @SerializedName("LinkInvoiceSaleId")
    public Long LinkInvoiceSaleId;

    @SerializedName("virtual_InvoiceSale")
    public ShopInvoiceSale virtual_InvoiceSale;
    @SerializedName("LinkParentId")
    public Long LinkParentId;

    @SerializedName("LinkContentId")
    public Long LinkContentId;
    @SerializedName("virtual_Content")
    public ShopContent virtual_Content;
//    @SerializedName("Content")
    public ShopContent Content;
    @SerializedName("LinkProductItemId")
    public Long LinkProductItemId;
    @SerializedName("virtual_ProductItem")
    public ShopProductItem virtual_ProductItem;
    @SerializedName("LinkProductCombineId")
    public Long LinkProductCombineId;
    @SerializedName("virtual_ProductCombine")
    public ShopProductCombine virtual_ProductCombine;

    @SerializedName("ProductProcessInputFormEndUserClassJsonFormValues")
    public String ProductProcessInputFormEndUserClassJsonFormValues;

    @SerializedName("LinkProductProcessId")
    public Long LinkProductProcessId;
    @SerializedName("virtual_ProductProcess")
    public ShopProductProcess virtual_ProductProcess;

    @SerializedName("LinkProductServiceId")
    public Long LinkProductServiceId;
    @SerializedName("virtual_ProductService")
    public ShopProductService virtual_ProductService;

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
