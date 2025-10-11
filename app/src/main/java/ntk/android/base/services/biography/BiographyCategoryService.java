package ntk.android.base.services.biography;

import android.content.Context;

import ntk.android.base.entitymodel.biography.BiographyCategoryModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class BiographyCategoryService extends CmsApiServerBase<BiographyCategoryModel, Long> {
    public BiographyCategoryService(Context context) {
        super(context, "BiographyCategory", BiographyCategoryModel.class);
    }

}
