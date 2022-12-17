package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstateActivityTypeModel;
import ntk.android.base.entitymodel.estate.EstatePropertyHistoryModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstateActivityTypeService extends CmsApiServerBase<EstateActivityTypeModel, String> {
    public EstateActivityTypeService(Context context) {
        super(context, "EstateActivityTypeModel", EstateActivityTypeModel.class);
    }
}
