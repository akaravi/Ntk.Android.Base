package ntk.android.base.services.file;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

interface IcmsFile {
    @Multipart
    @POST("api/v1/FileContent/fileUpload/")
    Observable<ResponseBody> UploadFileWithPartMap(@HeaderMap Map<String, String> headers, @PartMap() Map<String, RequestBody> partMap, @Part MultipartBody.Part file);

}
