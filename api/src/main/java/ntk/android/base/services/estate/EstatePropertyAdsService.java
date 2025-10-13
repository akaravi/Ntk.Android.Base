package ntk.android.base.services.estate;

import android.content.Context;

import ntk.android.base.entitymodel.estate.EstatePropertyAdsModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyAdsService extends CmsApiServerBase<EstatePropertyAdsModel, String> {
    public EstatePropertyAdsService(Context context) {
        super(context, "EstatePropertyAds", EstatePropertyAdsModel.class);
    }
}
