package ntk.android.base.entitymodel.hypershop;

import com.google.gson.annotations.SerializedName;

public class BankPaymentInjectCalculateModel {
    @SerializedName("Amount")
    public Float Amount;
    @SerializedName("FeeTax")
    public Float FeeTax;
    @SerializedName("FeeTransport")
    public Float FeeTransport;
    @SerializedName("AmountPure")
    public Float AmountPure;
}
