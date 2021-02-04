package ntk.android.base.services.hypershop;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.base.FilterModel;
import ntk.android.base.entitymodel.hypershop.HyperShopContentModel;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface IHyperShopContentService {
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopContentModel>> GetAll(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body FilterModel dataModel);

    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopContentModel>> GetOne(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers);
}
