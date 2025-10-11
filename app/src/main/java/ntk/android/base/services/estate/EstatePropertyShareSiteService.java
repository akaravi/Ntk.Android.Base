package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyShareSiteModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyShareSiteService extends CmsApiServerBase<EstatePropertyShareSiteModel, String> {
    public EstatePropertyShareSiteService(Context context) {
        super(context, "EstatePropertyShareSite", EstatePropertyShareSiteModel.class);
    }
}
