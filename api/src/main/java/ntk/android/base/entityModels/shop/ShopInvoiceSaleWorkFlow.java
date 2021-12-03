package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopInvoiceSaleWorkFlow extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("IsDefault")
    public boolean IsDefault;
    @SerializedName("IsInPreInvoiceActivation")
    public boolean IsInPreInvoiceActivation;
    @SerializedName("IsInInvoiceClosedActivation")
    public boolean IsInInvoiceClosedActivation;
    @SerializedName("LinkExternalModuleUniversalMenuId")
    public Long LinkExternalModuleUniversalMenuId;
}
