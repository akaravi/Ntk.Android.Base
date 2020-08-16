package ntk.base.api.hyperShop.interfase;
import java.util.Map;
import io.reactivex.Observable;
import ntk.base.api.hyperShop.model.HyperShopCategoryListRequest;
import ntk.base.api.hyperShop.model.HyperShopCategoryResponse;
import ntk.base.api.hyperShop.model.HyperShopContentListRequest;
import ntk.base.api.hyperShop.model.HyperShopContentResponse;
import ntk.base.api.hyperShop.model.HyperShopContentViewRequest;
import ntk.base.api.hyperShop.model.HyperShopOrderAddRequest;
import ntk.base.api.hyperShop.model.HyperShopOrderAddResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IHyperShop {
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: HyperShopCategoryList"})
    Observable<HyperShopCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body HyperShopCategoryListRequest request);
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: HyperShopContentList"})
    Observable<HyperShopContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body HyperShopContentListRequest request);
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: HyperShopContentView"})
    Observable<HyperShopContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body HyperShopContentViewRequest request);
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: HyperShopOrderAdd"})
    Observable<HyperShopOrderAddResponse> SetOrderAdd(@HeaderMap Map<String, String> headers, @Body HyperShopOrderAddRequest request);

}
