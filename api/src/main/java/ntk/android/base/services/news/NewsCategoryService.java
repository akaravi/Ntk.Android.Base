package ntk.android.base.services.news;

import android.content.Context;

import ntk.android.base.entitymodel.news.NewsCategoryModel;
import ntk.android.base.services.base.CmsApiServerBase;

public class NewsCategoryService extends CmsApiServerBase<NewsCategoryModel, Long> {
    public NewsCategoryService(Context context) {
        super(context, "NewsCategory", NewsCategoryModel.class);
    }

}
