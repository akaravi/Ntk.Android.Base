package ntk.android.base.services.bankpayment;

import android.content.Context;

import ntk.android.base.entitymodel.bankpayment.BankPaymentTransactionModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BankPaymentTransactionService extends CmsApiServerBase<BankPaymentTransactionModel, Long> {
    public BankPaymentTransactionService(Context context) {
        super(context, "BankPaymentTransaction", BankPaymentTransactionModel.class);
    }
}
