package ntk.android.base.services.pooling;

import android.content.Context;

import ntk.android.base.entitymodel.polling.PollingCategoryModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class PollingCategoryService extends CmsApiServerBase<PollingCategoryModel, Long> {


    public PollingCategoryService(Context context) {
        super(context, "PollingCategory", PollingCategoryModel.class);
    }
}
