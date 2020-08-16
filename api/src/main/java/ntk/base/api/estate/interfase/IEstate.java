package ntk.base.api.estate.interfase;

import io.reactivex.Observable;

import java.util.Map;

import ntk.base.api.estate.model.EstateContractTypeListResponse;
import ntk.base.api.estate.model.EstatePropertyAddRequest;
import ntk.base.api.estate.model.EstatePropertyAddResponse;
import ntk.base.api.estate.model.EstatePropertyDetailGroupListRequest;
import ntk.base.api.estate.model.EstatePropertyDetailGroupListResponse;
import ntk.base.api.estate.model.EstatePropertyDetailListRequest;
import ntk.base.api.estate.model.EstatePropertyDetailListResponse;
import ntk.base.api.estate.model.EstatePropertyFavoriteAddRequest;
import ntk.base.api.estate.model.EstatePropertyFavoriteAddResponse;
import ntk.base.api.estate.model.EstatePropertyFavoriteListRequest;
import ntk.base.api.estate.model.EstatePropertyFavoriteListResponse;
import ntk.base.api.estate.model.EstatePropertyFavoriteRemoveRequest;
import ntk.base.api.estate.model.EstatePropertyFavoriteRemoveResponse;
import ntk.base.api.estate.model.EstatePropertyListRequest;
import ntk.base.api.estate.model.EstatePropertyListResponse;
import ntk.base.api.estate.model.EstatePropertyTypeListRequest;
import ntk.base.api.estate.model.EstatePropertyTypeListResponse;
import ntk.base.api.estate.model.EstatePropertyViewRequest;
import ntk.base.api.estate.model.EstatePropertyViewResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IEstate {

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstateContractTypeList"})
    Observable<EstateContractTypeListResponse> GetContractType(@HeaderMap Map<String, String> headers);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyAdd"})
    Observable<EstatePropertyAddResponse> SetPropertyAdd(@HeaderMap Map<String, String> headers, @Body EstatePropertyAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyDetailGroupList"})
    Observable<EstatePropertyDetailGroupListResponse> GetPropertyDetailGroupList(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailGroupListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyDetailList"})
    Observable<EstatePropertyDetailListResponse> GetPropertyDetailList(@HeaderMap Map<String, String> headers, @Body EstatePropertyDetailListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyFavoriteAdd"})
    Observable<EstatePropertyFavoriteAddResponse> SetPropertyFavoriteAdd(@HeaderMap Map<String, String> headers, @Body EstatePropertyFavoriteAddRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyFavoriteList"})
    Observable<EstatePropertyFavoriteListResponse> GetPropertyFavoriteList(@HeaderMap Map<String, String> headers, @Body EstatePropertyFavoriteListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyFavoriteRemove"})
    Observable<EstatePropertyFavoriteRemoveResponse> SetPropertyFavoriteRemove(@HeaderMap Map<String, String> headers, @Body EstatePropertyFavoriteRemoveRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyList"})
    Observable<EstatePropertyListResponse> GetPropertyList(@HeaderMap Map<String, String> headers, @Body EstatePropertyListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyTypeList"})
    Observable<EstatePropertyTypeListResponse> GetPropertyType(@HeaderMap Map<String, String> headers, @Body EstatePropertyTypeListRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: EstatePropertyView"})
    Observable<EstatePropertyViewResponse> GetPropertyView(@HeaderMap Map<String, String> headers, @Body EstatePropertyViewRequest request);
}