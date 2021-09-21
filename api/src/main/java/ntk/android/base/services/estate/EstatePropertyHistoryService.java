package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyHistoryModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyHistoryService extends CmsApiServerBase<EstatePropertyHistoryModel, String> {
    public EstatePropertyHistoryService(Context context) {
        super(context, "EstatePropertyHistory", EstatePropertyHistoryModel.class);
    }
}
