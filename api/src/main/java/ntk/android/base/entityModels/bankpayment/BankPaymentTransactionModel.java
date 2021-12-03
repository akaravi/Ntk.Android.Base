package ntk.android.base.entitymodel.bankpayment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.base.feildinfo.GetPropertiesInfoModel;
import ntk.android.base.entitymodel.enums.EnumTransactionBankStatus;
import ntk.android.base.entitymodel.enums.EnumTransactionRecordStatus;

public class BankPaymentTransactionModel extends BaseEntity<Long> {
    @SerializedName("TransactionStatus")
    public int TransactionStatus; //as EnumTransactionRecordStatus
    @SerializedName("BankStatus")
    public int BankStatus;//as EnumTransactionBankStatus
    @SerializedName("CurrencyUnit")
    public String CurrencyUnit;
    @SerializedName("CurrencyUnitRatioByShop")
    public long CurrencyUnitRatioByShop;
    @SerializedName("SuccessStatusMessage")
    public String SuccessStatusMessage;
    @SerializedName("LastStatusMessage")
    public String LastStatusMessage;
    @SerializedName("LastTransactionCheckMessage")
    public String LastTransactionCheckMessage;
    @SerializedName("BackedFromBank")
    public boolean BackedFromBank;
    @SerializedName("LinkPrivateSiteConfigId")
    public long LinkPrivateSiteConfigId;
    @SerializedName("LinkUserId")
    public long LinkUserId;
    @SerializedName("Amount")
    public long Amount;
    @SerializedName("AmountPure")
    public long AmountPure;
    @SerializedName("StampJsonValues")
    public String StampJsonValues;
    @SerializedName("StampJsonFormatter")
    public List<GetPropertiesInfoModel> StampJsonFormatter;
    @SerializedName("RequestBackUserFromBankJsonValues")
    public String RequestBackUserFromBankJsonValues;
    @SerializedName("RequestBackUserFromBankJsonFormatter")
    public List<GetPropertiesInfoModel> RequestBackUserFromBankJsonFormatter;

    @SerializedName("OnlineDateLock")
    public String OnlineDateLock;
    @SerializedName("OnlineDateUnlock")
    public String OnlineDateUnlock;
    @SerializedName("LastUrlAddressInUse")
    public String LastUrlAddressInUse;
    // tslintdisable-next-line variable-name
    @SerializedName(" virtual_PrivateSiteConfig")
    public BankPaymentPrivateSiteConfigModel virtual_PrivateSiteConfig;
    @SerializedName("PrivateSiteConfig")
    public BankPaymentPrivateSiteConfigModel PrivateSiteConfig;

    @SerializedName("LinkModelShopCartId")
    long LinkModelShopCartId;
    @SerializedName("ModelShopInvoiceSaleRelease")
    boolean ModelShopInvoiceSaleRelease;
    @SerializedName("ModelShopInvoiceSaleReleaseDate")
    public String ModelShopInvoiceSaleReleaseDate;
    @SerializedName("TransactionLogs")
    public BankPaymentTransactionLogModel TransactionLogs;
}
