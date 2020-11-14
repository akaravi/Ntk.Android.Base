package ntk.android.base.services.hypershop;


import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.hypershop.HyperShopCategoryModel;
import ntk.android.base.dtomodel.hypershop.HyperShopContentModel;
import ntk.android.base.dtomodel.hypershop.HyperShopOrderModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterDataModel;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IHyperShopMicroService {

    @POST("{cpath}")//ContentGetAll
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopContentModel>> ContentGetAll(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @GET("{cpath}")//ContentGetOne/id
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopContentModel>> ContentGetOne(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers);


    @POST("{cpath}")//CategoryGetAll
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopCategoryModel>> CategoryGetAll(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

    @GET("{cpath}")//CategoryGetOne/id
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopCategoryModel>> CategoryGetOne(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers);


    @POST("{cpath}")//OrderAdd
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopOrderModel>> OrderAdd(@Path(value = "cpath",encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterDataModel request);

}
