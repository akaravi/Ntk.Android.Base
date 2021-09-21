package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyTypeModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyTypeService extends CmsApiServerBase<EstatePropertyTypeModel, String> {

    public EstatePropertyTypeService(Context context) {
        super(context, "EstatePropertyType", EstatePropertyTypeModel.class);
    }
}
