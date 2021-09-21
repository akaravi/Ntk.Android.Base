package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyTypeLanduseModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyTypeLanduseService extends CmsApiServerBase<EstatePropertyTypeLanduseModel, String> {

    public EstatePropertyTypeLanduseService(Context context) {
        super(context, "EstatePropertyTypeLanduse", EstatePropertyTypeLanduseModel.class);
    }
}
