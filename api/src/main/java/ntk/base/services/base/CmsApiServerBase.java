package ntk.base.services.base;

import android.content.Context;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ntk.base.config.RetrofitManager;
import ntk.base.entityModel.base.ErrorException;
import ntk.base.entityModel.base.ErrorExceptionBase;
import ntk.base.entityModel.base.FilterModel;

public class CmsApiServerBase<TEntity, TKey> {
    String baseUrl = "/api/v1/";
    String controlerUrl = "";
    Context context;
    Map<String, String> headers;

    public CmsApiServerBase(Context context, Map<String, String> headers, String controlerUrl) {
        this.context = context;
        this.controlerUrl = controlerUrl;
        this.headers = headers;
    }

    ICmsApiServerBase ICmsApiServerBase() {
        return new RetrofitManager(context).getRetrofitUnCached().create(ICmsApiServerBase.class);
    }

    public Observable<ErrorException<TEntity>> getAll(FilterModel request) {
        return ICmsApiServerBase().getAll(baseUrl + controlerUrl + "/getAll", headers, request);

    }

    public Observable<ErrorException<TEntity>> getViewModel() {
        return ICmsApiServerBase().getViewModel(baseUrl + controlerUrl + "/getViewModel", headers);

    }

    public Observable<ErrorExceptionBase> Exist(FilterModel request) {
        return ICmsApiServerBase().Exist(baseUrl + controlerUrl + "/Exist", headers, request);

    }

    public Observable<ErrorExceptionBase> Count(FilterModel request) {
        return ICmsApiServerBase().Count(baseUrl + controlerUrl + "/Count", headers, request);

    }

    public Observable<ErrorExceptionBase> ExportFile(FilterModel request) {
        return ICmsApiServerBase().ExportFile(baseUrl + controlerUrl + "/ExportFile", headers, request);

    }

    public Observable<ErrorExceptionBase> Add(TEntity request) {
        return ICmsApiServerBase().Add(baseUrl + controlerUrl + "/", headers, request);

    }

    public Observable<ErrorExceptionBase> Edit(TEntity request) {
        return ICmsApiServerBase().Edit(baseUrl + controlerUrl + "/1", headers, request);

    }

    public Observable<ErrorExceptionBase> Delete(TKey id) {
        return ICmsApiServerBase().Delete(baseUrl + controlerUrl + "/" + id, headers);

    }

    public Observable<ErrorExceptionBase> Delete(List<TKey> request) {
        return ICmsApiServerBase().Delete(baseUrl + controlerUrl + "/DeleteList", headers, request);

    }


}
