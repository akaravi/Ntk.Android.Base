package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyDetailModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyDetailService extends CmsApiServerBase<EstatePropertyDetailModel, String> {

    public EstatePropertyDetailService(Context context) {
        super(context, "EstatePropertyDetail", EstatePropertyDetailModel.class);
    }
    //todo ServiceEditStep method if need
}
