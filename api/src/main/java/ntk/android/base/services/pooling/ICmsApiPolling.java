package ntk.android.base.services.pooling;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.polling.PollingVoteModel;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ICmsApiPolling {
    @POST("{cpath}")
    @Headers({"content-type: application/json"})
    Observable<ErrorException<PollingVoteModel>> AddBatch(@Path("cpath") String cpath, @HeaderMap Map<String, String> headers, @Body List<PollingVoteModel> request);

}
