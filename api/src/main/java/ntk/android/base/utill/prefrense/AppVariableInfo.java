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
    public boolean isRegisterNotInterested() {
        return EasyPreference.with(c).getBoolean("register_not_interested", false);
    }
    private boolean isRegistered() {
        return EasyPreference.with(c).getBoolean("Registered", false);
    }

    public void setRegistered(boolean b) {
        EasyPreference.with(c).addBoolean("Registered", b);
    }

    public boolean IntroSeen() {
        return EasyPreference.with(c).getBoolean("Intro", false);
    }

    public void setIntroSeen(boolean b) {
        EasyPreference.with(c).addBoolean("Intro", b);
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
    public boolean isLogin() {
        return EasyPreference.with(c).getBoolean("isLogin", false);
    }

    public void setIsLogin(boolean b) {
        EasyPreference.with(c).addBoolean("isLogin", b);
    }
  
}
