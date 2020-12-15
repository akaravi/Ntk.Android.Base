package ntk.android.base.utill.prefrense;

import android.content.Context;

import com.google.gson.Gson;

import ntk.android.base.appclass.UpdateClass;

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



    public void setApplicationAppModel(String configApp) {
        EasyPreference.with(c).addString("setApplicationAppModel", configApp);
    }

    public boolean isLogin() {
        return EasyPreference.with(c).getBoolean("isLogin", false);
    }

    public void setIsLogin(boolean b) {
        EasyPreference.with(c).addBoolean("isLogin", b);
    }

    public void setUpdateInfo(UpdateClass updateClass) {

        EasyPreference.with(c).addString("updateModel", new Gson().toJson(updateClass));
    }

    public UpdateClass updateInfo() {
        String updateModel = EasyPreference.with(c).getString("updateModel", "");
        return new Gson().fromJson(updateModel, UpdateClass.class);
    }

    public void setQRCode(String downloadLinkSrcByDomainQRCodeBase64) {
        EasyPreference.with(c).addString("downloadLinkSrcByDomainQRCodeBase64", downloadLinkSrcByDomainQRCodeBase64);
    }
    public String qrCode(){
        return EasyPreference.with(c).getString("downloadLinkSrcByDomainQRCodeBase64","");
    }
}
