package ntk.android.base.entitymodel.bankpayment;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseEntity;
import ntk.android.base.entitymodel.enums.EnumTransactionRecordStatus;

class BankPaymentTransactionLogModel extends BaseEntity<Long> {
    @SerializedName("TransactionStatus")
    EnumTransactionRecordStatus TransactionStatus;
    @SerializedName("LinkTransactionId")
    long LinkTransactionId;

    // tslint:disable-next-line: variable-name
    @SerializedName("Virtual_Transaction")
    BankPaymentTransactionModel Virtual_Transaction;
    @SerializedName("Transaction")
    BankPaymentTransactionModel Transaction;
}
