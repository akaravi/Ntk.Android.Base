package ntk.android.base.dtomodel.bankpayment;

import com.google.gson.annotations.SerializedName;

class BankPaymentTransactionMakerDtoModel {
    @SerializedName("PaymentPrivateId")
    long PaymentPrivateId;
    @SerializedName("Price")
    long Price;
    @SerializedName("CartId")
    long CartId;
    @SerializedName("LastUrlAddressInUse")
    String LastUrlAddressInUse;
}
