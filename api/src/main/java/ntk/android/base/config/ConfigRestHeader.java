package ntk.android.base.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import java.util.HashMap;
import java.util.Map;

import ntk.android.base.BaseNtkApplication;
import ntk.android.base.utill.AppUtill;
import ntk.android.base.utill.EasyPreference;

public class ConfigRestHeader {
    final String tokenKey="DeviceToken";
    @SuppressLint("HardwareIds")
    public Map<String, String> GetHeaders(Context context) {

        TelephonyManager manager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        Map<String, String> headers = new HashMap<>();
        headers.put("Token", "");
        String prevToken = EasyPreference.with(context).getString(tokenKey, "");
        if (!prevToken.equalsIgnoreCase(""))
            headers.put("DeviceToken", prevToken);
        headers.put("LocationLong", "0");
        headers.put("LocationLat", "0");
        headers.put("DeviceId", Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID));
        headers.put("DeviceBrand", AppUtill.GetDeviceName());
        headers.put("Country", "IR");
        headers.put("Language", "FA");
        headers.put("SimCard", manager.getSimOperatorName());
        headers.put("PackageName", BaseNtkApplication.get().getApplicationParameter().PACKAGE_NAME());
        headers.put("AppBuildVer", String.valueOf(BaseNtkApplication.get().getApplicationParameter().VERSION_CODE()));//String.valueOf(BuildConfig.VERSION_CODE));
        headers.put("AppSourceVer", BaseNtkApplication.get().getApplicationParameter().VERSION_NAME());
        String NotId = EasyPreference.with(context).getString("NotificationId", "null");

        if (NotId != null && !NotId.isEmpty() && !NotId.toLowerCase().equals("null")) {
            headers.put("NotificationId", NotId);
            BaseNtkApplication.get().bindFireBase();
        }
        return headers;
    }

    public void replaceToken( Context context,String token){
       EasyPreference.with(context).addString(tokenKey, token);
    }
}
