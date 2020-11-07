package ntk.android.base.entitymodel.shop;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

/**
 * Created by karavi on 12/14/2017.
 */

public class ShopInvoiceSale extends BaseModuleEntity<Long> {

    @SerializedName("IsReleased")
    public boolean IsReleased;
    @SerializedName("ReleaseDate")
    public String ReleaseDate;
    @SerializedName("OnlineDateLock")
    public String OnlineDateLock;
    @SerializedName("OnlineDateUnlock")
    public String OnlineDateUnlock;
    @SerializedName("RegisterDate")
    public String RegisterDate;
    @SerializedName("DeliveryDate")
    public String DeliveryDate;
    @SerializedName("Description")
    public String Description;
    @SerializedName("LinkMemberUserId")
    public Long LinkMemberUserId;
    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;
    @SerializedName("Discount")
    public float Discount;
    @SerializedName("Tax")
    public Float Tax;
    @SerializedName("TotalAmount")
    public Float TotalAmount;
    @SerializedName("LinkModelBankPaymentTransactionSuccessfulId")
    public Long LinkModelBankPaymentTransactionSuccessfulId;

    @SerializedName("LinkExternalModuleDeliveryInvoiceId")
    public Long LinkExternalModuleDeliveryInvoiceId;
    @SerializedName("virtual_ShopInvoiceSaleWorkFlow")
    public ShopInvoiceSaleWorkFlow virtual_ShopInvoiceSaleWorkFlow;
    @SerializedName("PaymentStatus")
    public int PaymentStatus;
    @SerializedName("InvoiceStatus")
    public int InvoiceStatus;

    @SerializedName("ReceiverName")
    public String ReceiverName;
    @SerializedName("ReceiverLastName")
    public String ReceiverLastName;
    @SerializedName("ReceiverMobile")
    public String ReceiverMobile;
    @SerializedName("ReceiverTel")
    public String ReceiverTel;
    @SerializedName("ReceiverOstan")
    public String ReceiverOstan;
    @SerializedName("ReceiverCity")
    public String ReceiverCity;
    @SerializedName("ReceiverPostalCode")
    public String ReceiverPostalCode;
    @SerializedName("ReceiverAddress")
    public String ReceiverAddress;
    @SerializedName("ReceiverMemo")
    public String ReceiverMemo;
    @SerializedName("InvoiceSaleDetails")
    public ArrayList<ShopInvoiceSaleDetail> InvoiceSaleDetails;

}
