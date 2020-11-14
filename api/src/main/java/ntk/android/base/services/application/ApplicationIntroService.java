package ntk.android.base.services.application;

import android.content.Context;

import ntk.android.base.entitymodel.application.ApplicationIntroModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class ApplicationIntroService extends CmsApiServerBase<ApplicationIntroModel, Long> {
    public ApplicationIntroService(Context context) {
        super(context, "ApplicationIntro", ApplicationIntroModel.class);
    }
}
