package ntk.android.base.services.news;

import android.content.Context;

import ntk.android.base.entitymodel.news.NewsCategoryTagModel;
import ntk.android.base.services.base.CmsApiServerBase;

class NewsCategoryTagService extends CmsApiServerBase<NewsCategoryTagModel, Long> {
    public NewsCategoryTagService(Context context) {
        super(context, "NewsCategoryTag", NewsCategoryTagModel.class);
    }
}
