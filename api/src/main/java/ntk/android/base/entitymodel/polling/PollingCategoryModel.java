package ntk.android.base.entitymodel.polling;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.bankpayment.BankPaymentPublicConfigModel;
import ntk.android.base.entitymodel.bankpayment.BankPaymentTransactionModel;
import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class PollingCategoryModel extends BaseModuleEntity<Long> {

    @SerializedName("title")
    public String title;
    @SerializedName("currencyUnitRatioByShop")
    public long currencyUnitRatioByShop;
    @SerializedName("maxTransactionAmount")
    public long maxTransactionAmount;
    @SerializedName("minTransactionAmount")
    public long minTransactionAmount;
    @SerializedName("fixFeeTransactionAmount")
    public long fixFeeTransactionAmount;
    @SerializedName("percentFeeTransactionAmount")
    public long percentFeeTransactionAmount;
    @SerializedName("linkPublicConfigId")
    public Long linkPublicConfigId;
    @SerializedName("virtual_PublicConfig")
    public BankPaymentPublicConfigModel virtual_PublicConfig;
    @SerializedName("publicConfig")
    public BankPaymentPublicConfigModel publicConfig;
    @SerializedName("privateConfigJsonValues")
    public String privateConfigJsonValues;
    @SerializedName("memo")
    public String memo;
    @SerializedName("transactions")
    public List<BankPaymentTransactionModel> transactions;
    @SerializedName("linkModuleFileLogoIdSrc")
    public String linkModuleFileLogoIdSrc;

}