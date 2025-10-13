package ntk.android.base.services.biography;

import android.content.Context;

import ntk.android.base.entitymodel.biography.BiographyContentOtherInfoModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BiographyContentOtherInfoService extends CmsApiServerBase<BiographyContentOtherInfoModel, Long> {
    public BiographyContentOtherInfoService(Context context) {
        super(context, "BiographyContentOtherInfo", BiographyContentOtherInfoModel.class);
    }
}
