package ntk.android.base.services.hypershop;
import android.database.Observable;

import java.util.Map;

import ntk.android.base.dtoModel.hypershop.HyperShopCategoryModel;
import ntk.android.base.dtoModel.hypershop.HyperShopContentModel;
import ntk.android.base.dtoModel.hypershop.HyperShopOrderModel;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IHyperShopMicroService {

    @POST("{cpath}")//ContentGetAll
    @Headers({"content-type: application/json"})
    Observable<ntk.android.base.entitymodel.base.ErrorException<HyperShopContentModel>> ContentGetAll(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body ntk.android.base.entitymodel.base.FilterDataModel request);

    @GET("{cpath}")//ContentGetOne/id
    @Headers({"content-type: application/json"})
    Observable<ntk.android.base.entitymodel.base.ErrorException<HyperShopContentModel>> ContentGetOne(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body String Id);



    @POST("{cpath}")//CategoryGetAll
    @Headers({"content-type: application/json"})
    Observable<ntk.android.base.entitymodel.base.ErrorException<HyperShopCategoryModel>> CategoryGetAll(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body ntk.android.base.entitymodel.base.FilterDataModel request);

    @GET("{cpath}")//CategoryGetOne/id
    @Headers({"content-type: application/json"})
    Observable<ntk.android.base.entitymodel.base.ErrorException<HyperShopCategoryModel>> CategoryGetOne(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body String Id);



    @POST("{cpath}")//OrderAdd
    @Headers({"content-type: application/json"})
    Observable<ntk.android.base.entitymodel.base.ErrorException<HyperShopOrderModel>> OrderAdd(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body ntk.android.base.entitymodel.base.FilterDataModel request);

}
