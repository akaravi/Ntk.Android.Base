package ntk.android.base.config;

import android.content.Context;
import android.util.Log;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import ntk.android.base.BaseNtkApplication;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitManager {
    public static final String TAG = "RetrofitManager";
    public static String BASE_URL;
    public static final String HEADER_CACHE_CONTROL = "Cache-Control";
    public static final String HEADER_PRAGMA = "Pragma";

    private Context mContext;

    private Retrofit mRetrofit, mCachedRetrofit;

    private Cache mCache;
    private OkHttpClient mOkHttpClient, mCachedOkHttpClient;

    public RetrofitManager(Context context) {
        BASE_URL = "https://apicms.ir/";
        mContext = context;
        String staticUrl = BaseNtkApplication.get().staticConfig().URL;
        if (!staticUrl.equalsIgnoreCase(""))
            BASE_URL = staticUrl;
    }

    public RetrofitManager(Context context, String urls) {
        mContext = context;
        String staticUrl = BaseNtkApplication.get().staticConfig().URL;
        BASE_URL = urls;
        if (!staticUrl.equalsIgnoreCase(""))
            BASE_URL = staticUrl;

    }

    /**
     * this constructor pervent to set defualt custom Url to apiCmc e.q when hasannat Url is set
     * @param context
     * @param fundUrl
     * @param customizeDefualt
     */
    public RetrofitManager(Context context, String fundUrl, boolean customizeDefualt) {
        mContext = context;
        BASE_URL = fundUrl;
    }

    public Retrofit getRetrofit() {
        getRetrofit("");//new ConfigStaticValue(mContext).GetApiBaseUrl());
        return mRetrofit;
    }

    HttpLoggingInterceptor getLogInterceptor() {
        if (BaseNtkApplication.DEBUG)
            if (BaseNtkApplication.get().getApplicationParameter().APPLICATION_ID().contains("APPNTK")) {
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                return interceptor;
            }
        return null;
    }

    public Retrofit getCachedRetrofit() {
        getCachedRetrofit("");
        return mCachedRetrofit;
    }

    public Retrofit getRetrofitUnCached() {
        getRetrofitUnCached("");
        return mRetrofit;
    }

    public Retrofit getRetrofit(String Url) {
        if (mRetrofit == null) {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                    .addInterceptor(provideOfflineCacheInterceptor())
                    .addNetworkInterceptor(provideCacheInterceptor())
                    .cache(provideCache());
            //get debug interceptor;
            HttpLoggingInterceptor logInterceptor = getLogInterceptor();
            if (logInterceptor != null)
                httpClient.addInterceptor(logInterceptor);
            //add timeout
            httpClient
//                    .
//                    callTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(50, TimeUnit.SECONDS)
                    .readTimeout(50, TimeUnit.SECONDS);
            mOkHttpClient = httpClient.build();
            String BaseUrl = BASE_URL;
            if (Url != null && !Url.isEmpty()) {
                BaseUrl = Url;
            }
            if (BaseUrl.charAt(BaseUrl.length() - 1) != '/')
                BaseUrl = BaseUrl + "/";
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
                            .enableComplexMapKeySerialization()
                            .setDateFormat("yyyy-MM-dd'T'hh:mm:ss").serializeNulls()
                            .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                            .setExclusionStrategies()
                            .create()))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(mOkHttpClient)
                    .build();
        }

        return mRetrofit;
    }

    public Retrofit getCachedRetrofit(String Url) {
        if (mCachedRetrofit == null) {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                    // Add all interceptors you want (headers, URL, logging)
                    .addInterceptor(provideForcedOfflineCacheInterceptor())
                    .cache(provideCache());
            //get debug interceptor;
            HttpLoggingInterceptor logInterceptor = getLogInterceptor();
            if (logInterceptor != null)
                httpClient.addInterceptor(logInterceptor);

            mCachedOkHttpClient = httpClient.build();
//            if(NTKBASEApplication.DEBUG){
//
//            }
            String BaseUrl = BASE_URL;
            if (Url != null && !Url.isEmpty()) {
                BaseUrl = Url;
            }
            if (BaseUrl.charAt(BaseUrl.length() - 1) != '/')
                BaseUrl = BaseUrl + "/";
            mCachedRetrofit = new Retrofit.Builder()
                    .baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create((new GsonBuilder()
                            .enableComplexMapKeySerialization()
                            .setDateFormat("yyyy-MM-dd'T'hh:mm:ss").serializeNulls()
                            .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                            .setExclusionStrategies()
                            .create())))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(mCachedOkHttpClient)
                    .build();
        }

        return mCachedRetrofit;
    }

    public Retrofit getRetrofitUnCached(String Url) {
        if (mRetrofit == null) {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                    .addInterceptor(provideInterceptor());
            //get debug interceptor;
            HttpLoggingInterceptor logInterceptor = getLogInterceptor();
            if (logInterceptor != null)
                httpClient.addInterceptor(logInterceptor);
            //add timeout
            httpClient
//                    .
//                    callTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(50, TimeUnit.SECONDS)
                    .readTimeout(50, TimeUnit.SECONDS);
            mOkHttpClient = httpClient.build();

            String BaseUrl = BASE_URL;
            if (Url != null && !Url.isEmpty()) {
                BaseUrl = Url;
            }
            if (BaseUrl.charAt(BaseUrl.length() - 1) != '/')
                BaseUrl = BaseUrl + "/";
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create((new GsonBuilder()
                            .enableComplexMapKeySerialization()
                            .setDateFormat("yyyy-MM-dd'T'hh:mm:ss").serializeNulls()
                            .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                            .setExclusionStrategies()
                            .create())))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(mOkHttpClient)
                    .build();
        }
        return mRetrofit;
    }

//    public Observable<ResponseBody> FileUpload(String Url, String fileUri, Map<String, String> headers) {
//        File file = new File(fileUri);
//        String MULTIPART_FORM_DATA = "multipart/form-data";
//        // create RequestBody instance from file
//        RequestBody requestFile = RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA), file);
//
//        // MultipartBody.Part is used to send also the actual file name
//        MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestFile);
//
//
//        FileUploadModelPrev model = new FileUploadModelPrev();
//        model.FileName = file.getName();
//        model.Identifier = "abcd";
//        model.ChunkNumber = 1;
//        model.TotalChunks = 1;
//        model.TotalSize = file.length();
//        model.RelativePath = fileUri;
//
//        HashMap<String, RequestBody> map = new HashMap<>();
//        map.put("FileName", RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA), model.FileName));
//        map.put("Identifier", RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA), model.Identifier));
//        map.put("TotalChunks", RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA), model.TotalChunks + ""));
//        map.put("ChunkNumber", RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA), model.ChunkNumber + ""));
//        map.put("TotalSize", RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA), model.TotalSize + ""));
//        map.put("RelativePath", RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA), model.RelativePath + ""));
//
//
////        IFile upload = getRetrofitUnCached(Url).create(IFile.class);
////        return upload.uploadFileWithPartMap(headers, map, body);
//        return null;
//    }

    private Cache provideCache() {
        if (mCache == null) {
            try {
                mCache = new Cache(new File(mContext.getCacheDir(), "http-cache"),
                        10 * 1024 * 1024); // 10 MB
            } catch (Exception e) {
                Log.e(TAG, "Could not create Cache!");
            }
        }

        return mCache;
    }

    private Interceptor provideCacheInterceptor() {
        return chain -> {
            Response response = chain.proceed(chain.request());

            CacheControl cacheControl;

            if (NetworkDiscovery.isNetworkAvailable(mContext)) {
                cacheControl = new CacheControl.Builder()
                        .maxAge(0, TimeUnit.SECONDS)
                        .build();
            } else {
                cacheControl = new CacheControl.Builder()
                        .maxStale(7, TimeUnit.DAYS)
                        .build();
            }

            return response.newBuilder()
                    .removeHeader(HEADER_PRAGMA)
                    .removeHeader(HEADER_CACHE_CONTROL)
                    .header(HEADER_CACHE_CONTROL, cacheControl.toString())
                    .build();

        };
    }

    private Interceptor provideInterceptor() {
        return chain -> {
            Response response = chain.proceed(chain.request());

            return response.newBuilder()
                    .removeHeader(HEADER_PRAGMA)
                    .removeHeader(HEADER_CACHE_CONTROL)
                    .header("User-Agent", "NTKApp-Android")
                    .build();

        };
    }

    private Interceptor provideOfflineCacheInterceptor() {
        return chain -> {
            Request request = chain.request();

            if (!NetworkDiscovery.isNetworkAvailable(mContext)) {
                CacheControl cacheControl = new CacheControl.Builder()
                        .maxStale(7, TimeUnit.DAYS)
                        .build();

                request = request.newBuilder()
                        .removeHeader(HEADER_PRAGMA)
                        .removeHeader(HEADER_CACHE_CONTROL)
                        .cacheControl(cacheControl)
                        .build();
            }

            return chain.proceed(request);
        };
    }

    private Interceptor provideForcedOfflineCacheInterceptor() {
        return chain -> {
            Request request = chain.request();

            CacheControl cacheControl = new CacheControl.Builder()
                    .maxStale(7, TimeUnit.DAYS)
                    .build();

            request = request.newBuilder()
                    .removeHeader(HEADER_PRAGMA)
                    .removeHeader(HEADER_CACHE_CONTROL)
                    .cacheControl(cacheControl)
                    .build();

            return chain.proceed(request);
        };
    }

    public void clean() {
        if (mOkHttpClient != null) {
            // Cancel Pending Request
            mOkHttpClient.dispatcher().cancelAll();
        }

        if (mCachedOkHttpClient != null) {
            // Cancel Pending Cached Request
            mCachedOkHttpClient.dispatcher().cancelAll();
        }

        mRetrofit = null;
        mCachedRetrofit = null;

        if (mCache != null) {
            try {
                mCache.evictAll();
            } catch (IOException e) {
                Log.e(TAG, "Error cleaning http cache");
            }
        }

        mCache = null;
    }
}
