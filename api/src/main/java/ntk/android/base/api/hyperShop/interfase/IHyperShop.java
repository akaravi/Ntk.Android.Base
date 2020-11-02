package ntk.android.base.api.hyperShop.interfase;
import java.util.Map;
import io.reactivex.Observable;
import ntk.android.base.api.hyperShop.model.HyperShopCategoryListRequest;
import ntk.android.base.api.hyperShop.model.HyperShopCategoryResponse;
import ntk.android.base.api.hyperShop.model.HyperShopContentListRequest;
import ntk.android.base.api.hyperShop.model.HyperShopContentResponse;
import ntk.android.base.api.hyperShop.model.HyperShopContentViewRequest;
import ntk.android.base.api.hyperShop.model.HyperShopOrderAddRequest;
import ntk.android.base.api.hyperShop.model.HyperShopOrderAddResponse;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IHyperShop {
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: HyperShopCategoryActList"})
    Observable<HyperShopCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body HyperShopCategoryListRequest request);
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: HyperShopContentActList"})
    Observable<HyperShopContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body HyperShopContentListRequest request);
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: HyperShopContentActView"})
    Observable<HyperShopContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body HyperShopContentViewRequest request);
    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: HyperShopOrderActAdd"})
    Observable<HyperShopOrderAddResponse> SetOrderAdd(@HeaderMap Map<String, String> headers, @Body HyperShopOrderAddRequest request);

}
