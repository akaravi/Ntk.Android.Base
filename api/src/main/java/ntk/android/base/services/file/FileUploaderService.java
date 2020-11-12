package ntk.android.base.services.file;

import android.content.Context;
import android.net.Uri;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import ntk.android.base.config.ConfigRestHeader;
import ntk.android.base.config.RetrofitManager;
import ntk.android.base.entitymodel.file.FileUploadModel;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public class FileUploaderService {
    final String baseUrl = "api/v1/";
    Context context;
    Map<String, String> headers;


    public FileUploaderService(Context context) {
        headers = new ConfigRestHeader().GetHeaders(context);
    }

    IcmsFile ICmsApiFileUploader() {
        IcmsFile iCmsApiServerBase = new RetrofitManager(context).getRetrofitUnCached().create(IcmsFile.class);
        return iCmsApiServerBase;

    }

    public Observable<FileUploadModel> uploadFile(String filepath) {
        File file = new File(String.valueOf(Uri.parse(filepath)));
        return uploadFile(file);
    }

    private Observable<FileUploadModel> uploadFile(File file) {
        BehaviorSubject<FileUploadModel> mMovieCache = BehaviorSubject.create();

        RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        ICmsApiFileUploader().UploadFileWithPartMap(headers, new HashMap<>(), MultipartBody.Part.createFormData("File", file.getName(), requestFile))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(ResponseBody model) {
                        try {
                            String uploadedString = new Gson().fromJson(model.string(), FileUploadModel.class).FileKey;
                            FileUploadModel fileUploadModel = new FileUploadModel();
                            fileUploadModel.FileKey = uploadedString;
                            mMovieCache.onNext(fileUploadModel);
                        } catch (IOException e) {
                            mMovieCache.onError(new Exception("Ntk Upload Io Exception on file upload"));
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        mMovieCache.onError(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
        return mMovieCache;
    }

}
