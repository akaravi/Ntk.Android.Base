package ntk.android.base.services.estate;

import android.content.Context;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.ErrorExceptionBase;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.estate.EstatePropertyModel;
import ntk.android.base.services.base.CmsApiFavoriteBase;
import ntk.android.base.services.base.CmsApiServerBase;

public class EstatePropertyService extends CmsApiServerBase<EstatePropertyModel, String> {
    public EstatePropertyService(Context context) {
        super(context, "EstateProperty", EstatePropertyModel.class);
    }

    public Observable<ErrorExceptionBase> addFavorite(long Id) {
        return new CmsApiFavoriteBase<EstatePropertyModel, Long>(context, "EstateProperty", EstatePropertyModel.class).addFavorite(Id);
    }

    public Observable<ErrorExceptionBase> removeFavorite(long Id) {
        return new CmsApiFavoriteBase<EstatePropertyModel, Long>(context, "EstateProperty", EstatePropertyModel.class).removeFavorite(Id);
    }

    public Observable<ErrorException<EstatePropertyModel>> getFavoriteList(FilterModel request) {
        return new CmsApiFavoriteBase<EstatePropertyModel, Long>(context, "EstateProperty", EstatePropertyModel.class).getFavoriteList(request);
    }
}
