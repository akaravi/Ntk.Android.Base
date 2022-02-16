package ntk.android.base.utill.prefrense;

import android.content.Context;

import com.google.gson.Gson;

import ntk.android.base.appclass.AboutUsClass;
import ntk.android.base.appclass.UpdateClass;
import ntk.android.base.dtomodel.application.ApplicationScoreDtoModel;

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

    public void setQRCode(String downloadLinkSrcQRCodeBase64) {
        EasyPreference.with(c).addString("downloadLinkSrcQRCodeBase64", downloadLinkSrcQRCodeBase64);
    }

    public String qrCode() {
        return EasyPreference.with(c).getString("downloadLinkSrcQRCodeBase64", "");
    }

    public void setAboutUs(AboutUsClass aboutUsClass) {
        EasyPreference.with(c).addString("aboutUsClass", new Gson().toJson(aboutUsClass));

    }

    public AboutUsClass aboutUs() {
        String title = EasyPreference.with(c).getString("aboutUsClass", "");
        return new Gson().fromJson(title, AboutUsClass.class);
    }

    public void setAppId(long id) {
        EasyPreference.with(c).addLong("Variable_AppID", id);
    }

    public long appId() {
        return EasyPreference.with(c).getLong("Variable_AppID", 0);
    }

    public void setFeedback(ApplicationScoreDtoModel request) {
        EasyPreference.with(c).addString("Variable_feedback", new Gson().toJson(request));
    }

    public ApplicationScoreDtoModel feedback() {
        String updateModel = EasyPreference.with(c).getString("Variable_feedback", "");
        if (updateModel.equalsIgnoreCase(""))
            return null;
        else return new Gson().fromJson(updateModel, ApplicationScoreDtoModel.class);
    }
}
