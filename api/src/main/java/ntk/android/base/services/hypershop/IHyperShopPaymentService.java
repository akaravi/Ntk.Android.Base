package ntk.android.base.services.hypershop;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.hypershop.HyperShopPaymentDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface IHyperShopPaymentService {
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopPaymentDtoModel>> PaymentAdd(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body HyperShopPaymentDtoModel model);

}
