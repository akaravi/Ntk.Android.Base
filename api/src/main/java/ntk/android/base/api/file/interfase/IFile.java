package ntk.android.base.api.file.interfase;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.api.file.model.FileCategoryRequestPrev;
import ntk.android.base.api.file.model.FileCategoryResponsePrev;
import ntk.android.base.api.file.model.FileContentRequestPrev;
import ntk.android.base.api.file.model.FileContentResponsePrev;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

 interface IFile {


//    @POST("api/upload/")
//    @Headers({"content-type: multipart/form-data"})
//    @Multipart
//    Observable<String> Upload(@PartMap Map<String, RequestBody> map);


    //    @Multipart version 1
//    @POST("api/v1/FileContent/upload/")
//    Observable<String> uploadFileWithPartMap(@HeaderMap Map<String, String> headers, @PartMap() Map<String, RequestBody> partMap, @Part MultipartBody.Part file);
    @Multipart
    @POST("api/v1/FileContent/fileUpload/")
    Observable<ResponseBody> uploadFileWithPartMap(@HeaderMap Map<String, String> headers, @PartMap() Map<String, RequestBody> partMap, @Part MultipartBody.Part file);


    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: FileContentActList"})
    Observable<FileContentResponsePrev> GetContentList(@HeaderMap Map<String, String> headers, @Body FileContentRequestPrev request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: FileContentActView"})
    Observable<FileContentResponsePrev> GetContentView(@HeaderMap Map<String, String> headers, @Body FileContentRequestPrev request);

    @POST("api/v1/app/")
    @Headers({"content-type: application/json", "layout: FileCategoryActList"})
    Observable<FileCategoryResponsePrev> GetCategoryList(@HeaderMap Map<String, String> headers, @Body FileCategoryRequestPrev request);
}