package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyShareAgentModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyShareAgentService extends CmsApiServerBase<EstatePropertyShareAgentModel, String> {

    public EstatePropertyShareAgentService(Context context) {
        super(context, "EstatePropertyShareAgent", EstatePropertyShareAgentModel.class);
    }
}
