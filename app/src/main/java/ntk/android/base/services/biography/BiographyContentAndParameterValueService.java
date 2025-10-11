package ntk.android.base.services.biography;

import android.content.Context;

import ntk.android.base.services.base.CmsApiServerBase;

class BiographyContentAndParameterValueService extends CmsApiServerBase<String, Long> {
    public BiographyContentAndParameterValueService(Context context) {
        super(context, "BiographyContentAndParameterValue", String.class);
    }
}
