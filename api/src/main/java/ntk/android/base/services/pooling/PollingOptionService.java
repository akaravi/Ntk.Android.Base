package ntk.android.base.services.pooling;

import android.content.Context;

import ntk.android.base.entitymodel.polling.PollingOptionModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class PollingOptionService extends CmsApiServerBase<PollingOptionModel, Long> {


    public  PollingOptionService(Context context) {
        super(context, "PollingOption", PollingOptionModel.class);
    }
}
