package ntk.android.base.dtomodel.bankpayment;

import com.google.gson.annotations.SerializedName;

class BankPaymentSendUserToBankWebsiteResponceModel {
    @SerializedName("OutHtml")
    String  OutHtml;
    @SerializedName("LastUrlAddressInUse")
    String LastUrlAddressInUse;
}
