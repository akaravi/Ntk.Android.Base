package ntk.android.base.entitymodel.bankpayment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;

class BankPaymentPrivateSiteConfigModel extends BaseEntity<Long> {
    @SerializedName("Title")
    String Title;
    @SerializedName("CurrencyUnitRatioByShop")
    long CurrencyUnitRatioByShop;
    @SerializedName("MaxTransactionAmount")
    long MaxTransactionAmount;
    @SerializedName("MinTransactionAmount")
    long MinTransactionAmount;
    @SerializedName("FixFeeTransactionAmount")
    long FixFeeTransactionAmount;
    @SerializedName("PercentFeeTransactionAmount")
    long PercentFeeTransactionAmount;
    @SerializedName("LinkPublicConfigId")
    long LinkPublicConfigId;
    // tslint:disable-next-line: variable-name
    @SerializedName("Virtual_PublicConfig")
    BankPaymentPublicConfigModel Virtual_PublicConfig;
    @SerializedName("PublicConfig")
    BankPaymentPublicConfigModel PublicConfig;

    @SerializedName("PrivateConfigJsonValues")
    String PrivateConfigJsonValues;
    @SerializedName("Memo")
    String Memo;
    @SerializedName("Transactions")
    List<BankPaymentTransactionModel> Transactions;
    @SerializedName("LinkModuleFileLogoIdSrc")
    String LinkModuleFileLogoIdSrc;
}
