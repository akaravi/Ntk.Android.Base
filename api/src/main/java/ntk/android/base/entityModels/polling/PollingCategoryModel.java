package ntk.android.base.entitymodel.polling;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.bankpayment.BankPaymentPublicConfigModel;
import ntk.android.base.entitymodel.bankpayment.BankPaymentTransactionModel;
import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class PollingCategoryModel extends BaseModuleEntity<Long> {

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
    public Long LinkPublicConfigId;
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
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
}