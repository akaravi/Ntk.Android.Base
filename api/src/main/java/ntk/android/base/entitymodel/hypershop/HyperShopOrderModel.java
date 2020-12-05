package ntk.android.base.entitymodel.hypershop;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class HyperShopOrderModel extends BaseModuleEntity<Long> {
    @SerializedName("PaymentType")
    public int PaymentType;//as
    @SerializedName("SystemTransactionId")
    public long SystemTransactionId;
    @SerializedName("SystemPaymentIsSuccess")
    public long SystemPaymentIsSuccess;
    @SerializedName("SystemMicroServiceOrderId")
    public String SystemMicroServiceOrderId;
    @SerializedName("SystemMicroServiceAccept")
    public boolean SystemMicroServiceAccept;
    @SerializedName("SystemMicroServiceId")
    public String SystemMicroServiceId;
    @SerializedName("SystemMicroServiceIsSuccess")
    public boolean SystemMicroServiceIsSuccess;
    @SerializedName("SystemMicroServiceErrorMessage")
    public String SystemMicroServiceErrorMessage;
    @SerializedName("Name")
    public String Name;
    @SerializedName("Family")
    public String Family;
    @SerializedName("Mobile")
    public String Mobile;
    @SerializedName("Address")
    public String Address;
    @SerializedName("Amount")
    public long Amount;
    @SerializedName("Products")
    public List<HyperShopOrderContentModel> Products;

}
