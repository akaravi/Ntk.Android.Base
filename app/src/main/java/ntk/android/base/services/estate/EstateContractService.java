package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstateContractModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstateContractService extends CmsApiServerBase<EstateContractModel, String> {
    public EstateContractService(Context context) {
        super(context, "EstateContract", EstateContractModel.class);
    }

}
