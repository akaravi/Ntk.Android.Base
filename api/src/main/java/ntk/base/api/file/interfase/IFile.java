package ntk.base.api.file.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.base.api.file.model.FileCategoryRequest;
import ntk.base.api.file.model.FileCategoryResponse;
import ntk.base.api.file.model.FileContentRequest;
import ntk.base.api.file.model.FileContentResponse;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface IFile {


//    @POST("api/upload/")
//    @Headers({"content-type: multipart/form-data"})
//    @Multipart
//    Observable<String> Upload(@PartMap Map<String, RequestBody> map);


    @Multipart
    @POST("api/upload/")
    Observable<String> uploadFileWithPartMap(@HeaderMap Map<String, String> headers, @PartMap() Map<String, RequestBody> partMap, @Part MultipartBody.Part file);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: "})
    Observable<FileContentResponse> GetContentList(@HeaderMap Map<String, String> headers, @Body FileContentRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: "})
    Observable<FileContentResponse> GetContentView(@HeaderMap Map<String, String> headers, @Body FileContentRequest request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: "})
    Observable<FileCategoryResponse> GetCategoryList(@HeaderMap Map<String, String> headers, @Body FileCategoryRequest request);
}