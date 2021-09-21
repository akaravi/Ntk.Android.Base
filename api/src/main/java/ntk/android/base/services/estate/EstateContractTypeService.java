package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstateContractTypeModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstateContractTypeService extends CmsApiServerBase<EstateContractTypeModel, String> {
    public EstateContractTypeService(Context context) {
        super(context, "EstateContractType", EstateContractTypeModel.class);
    }
}
