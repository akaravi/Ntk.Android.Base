package ntk.android.base.utill.prefrense;

import android.content.Context;

public class AppVariableInfo {
    Context c;

    AppVariableInfo(Context context) {
        this.c = context;
    }

    public void set_registerNotInterested(boolean b) {
        EasyPreference.with(c).addBoolean("register_not_interested", b);
    }

    public boolean isRegistered() {
        return EasyPreference.with(c).getBoolean("Registered", false);
    }

    public void setRegistered(boolean b) {
        EasyPreference.with(c).addBoolean("Registered", b);
    }

    public boolean IntroSeen() {
        return EasyPreference.with(c).getBoolean("Registered", false);
    }

    public void setIntroSeen(boolean b) {
        EasyPreference.with(c).addBoolean("Registered", b);
    }

    public String notificationId() {
        return EasyPreference.with(c).getString("NotificationId", "");
    }

    public void setNotificationId(String mToken) {
        EasyPreference.with(c).addString("NotificationId", mToken);
    }
    public String configapp() {
        return EasyPreference.with(c).getString("configapp", "");
    }

    public void setConfigapp(String configApp) {
        EasyPreference.with(c).addString("configapp", configApp);
    }
}
