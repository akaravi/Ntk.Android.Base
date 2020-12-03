package ntk.android.base.services.biography;

import android.content.Context;

import ntk.android.base.entitymodel.biography.BiographyContentTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BiographyContentTagService extends CmsApiServerBase<BiographyContentTagModel, Long> {
    public BiographyContentTagService(Context context) {
        super(context, "BiographyContentTag", BiographyContentTagModel.class);
    }
}
