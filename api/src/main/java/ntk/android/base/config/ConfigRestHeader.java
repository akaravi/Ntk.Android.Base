package ntk.android.base.config;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import java.util.HashMap;
import java.util.Map;

import ntk.android.base.ApplicationStaticParameter;
import ntk.android.base.BaseNtkApplication;
import ntk.android.base.utill.AppUtil;
import ntk.android.base.utill.prefrense.Preferences;

public class ConfigRestHeader {

    public Map<String, String> GetHeaders(Context context) {

        TelephonyManager manager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        Map<String, String> headers = new HashMap<>();
        String staticToken = BaseNtkApplication.get().staticConfig().TONEN;
        if (!staticToken.equalsIgnoreCase("")) {
            headers.put("Token", staticToken);
            headers.put("Authorization", staticToken);
        } else{
            String auth = Preferences.with(context).tokenInfo().authorizationToken();

            headers.put("Token", auth);
            headers.put("Authorization", auth);
        }
        String staticDevice_token = ApplicationStaticParameter.DEVICE_TOKEN;
        if (!staticDevice_token.equalsIgnoreCase(""))
            headers.put("DeviceToken", staticDevice_token);
        else {
            String prevToken = Preferences.with(context).tokenInfo().deviceToken();
            if (!prevToken.equalsIgnoreCase(""))
                headers.put("DeviceToken", prevToken);
        }
        String staticPackageName = ApplicationStaticParameter.PACKAGE_NAME;
        if (staticPackageName.equalsIgnoreCase(""))
            headers.put("PackageName", BaseNtkApplication.get().getApplicationParameter().PACKAGE_NAME());
        else
            headers.put("PackageName", staticPackageName);

        headers.put("LocationLong", "0");
        headers.put("LocationLat", "0");
        headers.put("DeviceId", Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID));
        headers.put("DeviceBrand", AppUtil.GetDeviceName());
        headers.put("Country", "IR");
        headers.put("Language",  BaseNtkApplication.get().getLanguage());
        headers.put("SimCard", manager.getSimOperatorName());
        headers.put("AppBuildVer", String.valueOf(BaseNtkApplication.get().getApplicationParameter().VERSION_CODE()));//String.valueOf(BuildConfig.VERSION_CODE));
        headers.put("AppSourceVer", BaseNtkApplication.get().getApplicationParameter().VERSION_NAME());
        String NotId = Preferences.with(context).appVariableInfo().notificationId();

        if (NotId != null && !NotId.isEmpty() && !NotId.toLowerCase().equals("null")) {
            headers.put("NotificationId", NotId);
            BaseNtkApplication.get().bindFireBase();
        }
        return headers;
    }

}
