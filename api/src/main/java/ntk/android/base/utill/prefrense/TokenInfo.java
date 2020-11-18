package ntk.android.base.utill.prefrense;

import android.content.Context;

public class TokenInfo {
    Context c;

    TokenInfo(Context c) {
        this.c = c;
    }
    public String authorizationToken() {
        return EasyPreference.with(c).getString("AuthorizationToken", "");
    }

    public void setAuthorizationToken(String s) {
        EasyPreference.with(c).addString("AuthorizationToken", s);
    }

    public String deviceToken() {
        return EasyPreference.with(c).getString("DeviceToken", "");
    }

    public void setDeviceToken(String s) {
        EasyPreference.with(c).addString("DeviceToken", s);
    }
}
