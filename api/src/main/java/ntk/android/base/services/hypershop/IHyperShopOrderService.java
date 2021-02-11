package ntk.android.base.services.hypershop;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.dtomodel.bankpayment.BankPaymentOnlineTransactionModel;
import ntk.android.base.dtomodel.hypershop.HyperShopOrderDtoModel;
import ntk.android.base.dtomodel.hypershop.HyperShopOrderPaymentDtoModel;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.hypershop.HyperShopOrderModel;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface IHyperShopOrderService {
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopOrderModel>> OrderAdd(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body HyperShopOrderModel model);

    @GET("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<HyperShopOrderModel>> LastOrder(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers);

    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<BankPaymentOnlineTransactionModel>> OrderPayment(@Path(value = "cpath", encoded = true) String cpath, @HeaderMap Map<String, String> headers, @Body HyperShopOrderPaymentDtoModel model);

}
