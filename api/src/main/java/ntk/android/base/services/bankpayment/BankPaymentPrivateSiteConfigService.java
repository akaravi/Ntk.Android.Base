package ntk.android.base.services.bankpayment;

import android.content.Context;

import ntk.android.base.entitymodel.bankpayment.BankPaymentPrivateSiteConfigModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BankPaymentPrivateSiteConfigService extends CmsApiServerBase<BankPaymentPrivateSiteConfigModel, Long> {

    public BankPaymentPrivateSiteConfigService(Context context) {
        super(context, "BankPaymentPrivateSiteConfig", BankPaymentPrivateSiteConfigModel.class);
    }
}
