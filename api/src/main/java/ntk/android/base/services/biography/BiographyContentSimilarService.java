package ntk.android.base.services.biography;

import android.content.Context;

import ntk.android.base.entitymodel.biography.BiographyContentSimilarModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BiographyContentSimilarService extends CmsApiServerBase<BiographyContentSimilarModel, Long> {
    public BiographyContentSimilarService(Context context) {
        super(context, "BiographyContentSimilar", BiographyContentSimilarModel.class);
    }
}
