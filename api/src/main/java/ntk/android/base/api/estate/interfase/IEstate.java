package ntk.android.base.api.estate.interfase;

import io.reactivex.Observable;

import java.util.Map;

import ntk.android.base.api.estate.model.EstateContractTypeListRequest;
import ntk.android.base.api.estate.model.EstateContractTypeListResponse;
import ntk.android.base.api.estate.model.EstatePropertyAddRequest;
import ntk.android.base.api.estate.model.EstatePropertyAddResponse;

import ntk.android.base.api.estate.model.EstatePropertyFavoriteAddRequest;
import ntk.android.base.api.estate.model.EstatePropertyFavoriteAddResponse;
import ntk.android.base.api.estate.model.EstatePropertyFavoriteListRequest;
import ntk.android.base.api.estate.model.EstatePropertyFavoriteListResponse;
import ntk.android.base.api.estate.model.EstatePropertyFavoriteRemoveRequest;
import ntk.android.base.api.estate.model.EstatePropertyFavoriteRemoveResponse;
import ntk.android.base.api.estate.model.EstatePropertyListRequest;
import ntk.android.base.api.estate.model.EstatePropertyListResponse;
import ntk.android.base.api.estate.model.EstatePropertyTypeListRequest;
import ntk.android.base.api.estate.model.EstatePropertyTypeListResponse;
import ntk.android.base.api.estate.model.EstatePropertyViewRequest;
import ntk.android.base.api.estate.model.EstatePropertyViewResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IEstate {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstateContractTypeActList"})
    Observable<EstateContractTypeListResponse> GetEstateContractTypeActList(@HeaderMap Map<String, String> headers, @Body EstateContractTypeListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyActAdd"})
    Observable<EstatePropertyAddResponse> SetEstatePropertyActAdd(@HeaderMap Map<String, String> headers, @Body EstatePropertyAddRequest request);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyActList"})
    Observable<EstatePropertyListResponse> GetEstatePropertyActList(@HeaderMap Map<String, String> headers, @Body EstatePropertyListRequest request);



    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyActView"})
    Observable<EstatePropertyViewResponse> GetEstatePropertyActView(@HeaderMap Map<String, String> headers, @Body EstatePropertyViewRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyFavoriteActAdd"})
    Observable<EstatePropertyFavoriteAddResponse> SetEstatePropertyFavoriteActAdd(@HeaderMap Map<String, String> headers, @Body EstatePropertyFavoriteAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyFavoriteActList"})
    Observable<EstatePropertyFavoriteListResponse> GetEstatePropertyFavoriteActList(@HeaderMap Map<String, String> headers, @Body EstatePropertyFavoriteListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyFavoriteActRemove"})
    Observable<EstatePropertyFavoriteRemoveResponse> SetEstatePropertyFavoriteActRemove(@HeaderMap Map<String, String> headers, @Body EstatePropertyFavoriteRemoveRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyTypeActList"})
    Observable<EstatePropertyTypeListResponse> GetEstatePropertyTypeActList(@HeaderMap Map<String, String> headers, @Body EstatePropertyTypeListRequest request);

}