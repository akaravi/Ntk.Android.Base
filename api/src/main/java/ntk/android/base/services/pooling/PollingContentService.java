package ntk.android.base.services.pooling;

import android.content.Context;

import ntk.android.base.entitymodel.polling.PollingCategoryModel;
import ntk.android.base.entitymodel.polling.PollingContentModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class PollingContentService extends CmsApiServerBase<PollingContentModel, Long> {


    public PollingContentService(Context context) {
        super(context, "PollingContent", PollingContentModel.class);
    }
}
