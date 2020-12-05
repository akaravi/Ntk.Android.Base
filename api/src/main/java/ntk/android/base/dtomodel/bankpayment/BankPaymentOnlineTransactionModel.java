package ntk.android.base.dtomodel.bankpayment;

import com.google.gson.annotations.SerializedName;

public class BankPaymentOnlineTransactionModel {
    @SerializedName("LinkOrderId")
    public long LinkOrderId;
    @SerializedName("BankPaymentPrivateId")
    public long BankPaymentPrivateId;
    @SerializedName("LastUrlAddressInUse")
    public String LastUrlAddressInUse;
}
