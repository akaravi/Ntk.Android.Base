package ntk.android.base.services.estate;

import android.content.Context;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.config.ListOfJson;
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



    public Observable<ErrorException<EstatePropertyModel>> getAllWithCustomerOrderId(String CustomerOrderId,FilterModel request){
        BehaviorSubject<ErrorException<EstatePropertyModel>> mMovieCache = BehaviorSubject.create();
        Observable<ErrorException> all = ICmsApiServerBase().getAll(baseUrl + controlerUrl + "/GetAllWithCustomerOrderId/"+ CustomerOrderId, headers, request);
        all.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe(new Observer<ErrorException>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ErrorException o) {
                        Gson gson = new GsonBuilder()
                                .enableComplexMapKeySerialization()
                                .setDateFormat("yyyy-MM-dd'T'hh:mm:ss").serializeNulls()
                                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                                .setExclusionStrategies()
                                .create();
                        o.Item = gson.fromJson(gson.toJson(o.Item), EstatePropertyModel.class);
                        o.ListItems = gson.fromJson(gson.toJson(o.ListItems), new ListOfJson<EstatePropertyModel>(EstatePropertyModel.class));
                        mMovieCache.onNext(o);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mMovieCache.onError(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
        return mMovieCache;
    }
}
