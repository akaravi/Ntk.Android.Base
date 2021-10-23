package ntk.android.base.services.core;

import android.content.Context;

import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.core.CoreLocationModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class CoreLocationService extends CmsApiServerBase<CoreLocationModel, Long> {

    public CoreLocationService(Context context) {
        super(context, "CoreLocation", CoreLocationModel.class);
    }
    public ErrorException<CoreLocationModel> ServiceGetAllProvinces(FilterModel model){
        return null;
    }
    public ErrorException<CoreLocationModel> ServiceGetAllCities(FilterModel model){ return null;}

}
