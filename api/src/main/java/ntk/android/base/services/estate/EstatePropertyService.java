package ntk.android.base.services.estate;

import android.content.Context;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.core.CoreModuleReportAbuseDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.estate.EstatePropertyModel;
import ntk.android.base.entitymodel.news.NewsCommentModel;
import ntk.android.base.services.base.CmsApiFavoriteBase;
import ntk.android.base.services.base.CmsApiServerBase;
import ntk.android.base.services.base.CmsReportAbuse;

public class EstatePropertyService extends CmsApiServerBase<EstatePropertyModel, String> {
    public EstatePropertyService(Context context) {
        super(context, "EstateProperty", EstatePropertyModel.class);
    }

    public Observable<ErrorExceptionBase> addFavorite(String Id) {
        return new CmsApiFavoriteBase<EstatePropertyModel, String>(context, "EstateProperty", EstatePropertyModel.class).addFavorite(Id);
    }

    public Observable<ErrorExceptionBase> removeFavorite(String Id) {
        return new CmsApiFavoriteBase<EstatePropertyModel, String>(context, "EstateProperty", EstatePropertyModel.class).removeFavorite(Id);
    }

    public Observable<ErrorException<EstatePropertyModel>> getFavoriteList(FilterModel request) {
        return new CmsApiFavoriteBase<EstatePropertyModel, String>(context, "EstateProperty", EstatePropertyModel.class).getFavoriteList(request);
    }

    public Observable<ErrorException<EstatePropertyModel>> report(CoreModuleReportAbuseDtoModel model) {
        return new CmsReportAbuse<EstatePropertyModel,String>(context, "EstateProperty", EstatePropertyModel.class).addReport(model);

    }
}
