package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyTypeUsageModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyTypeUsageService extends CmsApiServerBase<EstatePropertyTypeUsageModel,String> {
    public EstatePropertyTypeUsageService(Context context) {
        super(context, "EstatePropertyTypeUsage", EstatePropertyTypeUsageModel.class);
    }
}
