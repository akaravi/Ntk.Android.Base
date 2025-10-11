package ntk.android.base.services.file;

import java.util.Map;

import io.reactivex.Observable;
import ntk.android.base.entitymodel.base.ErrorException;
import ntk.android.base.entitymodel.file.FileUploadModel;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

interface IcmsFile {
//    @POST("api/v1/FileContent/fileUpload/")
    @Multipart
    @POST("api/v1/upload")
//    Observable<ErrorException<FileUploadModel>> UploadFileWithPartMap(@HeaderMap Map<String, String> headers, @PartMap() Map<String, RequestBody> partMap, @Part MultipartBody.Part file);
    Observable<ErrorException<FileUploadModel>> UploadFileWithPartMap(@HeaderMap Map<String, String> headers, @Part("filename")RequestBody fname, @Part MultipartBody.Part file);

}
