package ntk.android.base.entitymodel.bankpayment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;

public class BankPaymentPrivateSiteConfigModel extends BaseEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("CurrencyUnitRatioByShop")
    public long CurrencyUnitRatioByShop;
    @SerializedName("MaxTransactionAmount")
    public long MaxTransactionAmount;
    @SerializedName("MinTransactionAmount")
    public long MinTransactionAmount;
    @SerializedName("FixFeeTransactionAmount")
    public long FixFeeTransactionAmount;
    @SerializedName("PercentFeeTransactionAmount")
    public long PercentFeeTransactionAmount;
    @SerializedName("LinkPublicConfigId")
    public long LinkPublicConfigId;
    // tslint:disable-next-line: variable-name
    @SerializedName(" virtual_PublicConfig")
    public BankPaymentPublicConfigModel virtual_PublicConfig;
    @SerializedName("PublicConfig")
    public BankPaymentPublicConfigModel PublicConfig;

    @SerializedName("PrivateConfigJsonValues")
    public String PrivateConfigJsonValues;
    @SerializedName("Memo")
    public String Memo;
    @SerializedName("Transactions")
    public List<BankPaymentTransactionModel> Transactions;
    @SerializedName("LinkModuleFileLogoIdSrc")
    public String LinkModuleFileLogoIdSrc;
}
