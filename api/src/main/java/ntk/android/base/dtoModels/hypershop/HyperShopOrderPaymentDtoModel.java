package ntk.android.base.dtomodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class HyperShopOrderPaymentDtoModel {
    @SerializedName("LinkOrderId")
    public Long LinkOrderId;
    @SerializedName("BankPaymentPrivateId")
    public Long BankPaymentPrivateId;
    @SerializedName("LastUrlAddressInUse")
    public String LastUrlAddressInUse;
}
