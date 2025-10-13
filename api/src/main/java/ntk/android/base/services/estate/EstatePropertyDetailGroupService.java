package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyDetailGroupModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyDetailGroupService extends CmsApiServerBase<EstatePropertyDetailGroupModel, String> {

    public EstatePropertyDetailGroupService(Context context) {
        super(context, "EstatePropertyDetailGroup", EstatePropertyDetailGroupModel.class);
    }
    //todo ServiceEditStep method if need
}
