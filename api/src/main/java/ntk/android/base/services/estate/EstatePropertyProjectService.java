package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyProjectModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyProjectService extends CmsApiServerBase<EstatePropertyProjectModel, String> {

    public EstatePropertyProjectService(Context context) {
        super(context, "EstatePropertyProject", EstatePropertyProjectModel.class);
    }
}
