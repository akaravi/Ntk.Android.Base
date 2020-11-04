package ntk.android.base.entitymodel.bankpayment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.base.feildinfo.GetPropertiesInfoModel;
import ntk.android.base.entitymodel.enums.EnumTransactionBankStatus;
import ntk.android.base.entitymodel.enums.EnumTransactionRecordStatus;

class BankPaymentTransactionModel extends BaseEntity<Long> {
    @SerializedName("TransactionStatus")
    EnumTransactionRecordStatus TransactionStatus;
    @SerializedName("BankStatus")
    EnumTransactionBankStatus BankStatus;
    @SerializedName("CurrencyUnit")
    String CurrencyUnit;
    @SerializedName("CurrencyUnitRatioByShop")
    long CurrencyUnitRatioByShop;
    @SerializedName("SuccessStatusMessage")
    String SuccessStatusMessage;
    @SerializedName("LastStatusMessage")
    String LastStatusMessage;
    @SerializedName("LastTransactionCheckMessage")
    String LastTransactionCheckMessage;
    @SerializedName("BackedFromBank")
    boolean BackedFromBank;
    @SerializedName("LinkPrivateSiteConfigId")
    long LinkPrivateSiteConfigId;
    @SerializedName("LinkUserId")
    long LinkUserId;
    @SerializedName("Amount")
    long Amount;
    @SerializedName("AmountPure")
    long AmountPure;
    @SerializedName("StampJsonValues")
    String StampJsonValues;
    @SerializedName("StampJsonFormatter")
    List<GetPropertiesInfoModel> StampJsonFormatter;
    @SerializedName("RequestBackUserFromBankJsonValues")
    String RequestBackUserFromBankJsonValues;
    @SerializedName("RequestBackUserFromBankJsonFormatter")
    List<GetPropertiesInfoModel> RequestBackUserFromBankJsonFormatter;

    @SerializedName("OnlineDateLock")
    String OnlineDateLock;
    @SerializedName("OnlineDateUnlock")
    String OnlineDateUnlock;
    @SerializedName("LastUrlAddressInUse")
    String LastUrlAddressInUse;
    // tslintdisable-next-line variable-name
    @SerializedName("virtual_PrivateSiteConfig")
    BankPaymentPrivateSiteConfigModel virtual_PrivateSiteConfig;
    @SerializedName("PrivateSiteConfig")
    BankPaymentPrivateSiteConfigModel PrivateSiteConfig;

    @SerializedName("LinkModelShopCartId")
    long LinkModelShopCartId;
    @SerializedName("ModelShopInvoiceSaleRelease")
    boolean ModelShopInvoiceSaleRelease;
    @SerializedName("ModelShopInvoiceSaleReleaseDate")
    String ModelShopInvoiceSaleReleaseDate;
    @SerializedName("TransactionLogs")
    BankPaymentTransactionLogModel TransactionLogs;
}
