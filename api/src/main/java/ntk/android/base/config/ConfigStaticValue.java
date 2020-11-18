package ntk.android.base.config;

import android.content.Context;



public class ConfigStaticValue {
    public ConfigStaticValue(Context context) {
        privateContext=context;
        ApiBaseAppId = 0;
        ApiBaseUrl = null;
        ApiBaseUrl = "http://1ae1b434e33b.ngrok.io/";


    }
    private Context privateContext;
    public void UrlPreferenceUseed() {

    }

    private String ApiBaseUrl;
    public String GetApiBaseUrl()
    {
//        if (privateContext != null) {
//            String ApiBaseUrlPreference = "";
//            int ApiBaseUrlPreferenceUseed = 0;
//            ApiBaseUrlPreference = EasyPreference.with(privateContext).getString("ApiBaseUrl", "");
//            ApiBaseUrlPreferenceUseed = EasyPreference.with(privateContext).getInt("ApiBaseUrlUseed", 0);
//            if (ApiBaseUrlPreference != null && !ApiBaseUrlPreference.isEmpty() && ApiBaseUrlPreferenceUseed < 10) {
//                UrlPreferenceUseed();
//                return ApiBaseUrlPreference;
//            }
//        }
        return ApiBaseUrl;
    }
    public int ApiBaseAppId;
}