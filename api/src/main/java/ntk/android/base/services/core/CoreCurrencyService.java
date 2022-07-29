package ntk.android.base.services.core;

import android.content.Context;

import ntk.android.base.entitymodel.coremain.CoreCurrencyModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class CoreCurrencyService extends CmsApiServerBase<CoreCurrencyModel, Long> {
    public CoreCurrencyService(Context context) {
        super(context, "CoreCurrency", CoreCurrencyModel.class);
    }
}
