package ntk.android.base;

import android.content.Context;

import androidx.multidex.MultiDexApplication;

import java.io.File;

import ntk.android.base.utill.prefrense.Preferences;


/**
 *
 */
public abstract class BaseNtkApplication extends MultiDexApplication implements ApplicationParamProvider {

    protected static BaseNtkApplication instance;
    public static boolean DEBUG = false;

    public static BaseNtkApplication get() {
        return instance;
    }

    /**
     * when attach process to system , init Bug reporting
     *
     * @param base
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public static Context getAppContext() {
        return instance.getApplicationContext();
    }

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
        if (!new File(getCacheDir(), "image").exists()) {
            new File(getCacheDir(), "image").mkdirs();
        }
    }

    protected ApplicationStaticParameter getConfig() {
        return null;
    }

    public abstract void bindFireBase();

    public ApplicationStaticParameter staticConfig() {
        ApplicationStaticParameter config = getConfig();
        if (config == null)
            config = new ApplicationStaticParameter();
        if (ApplicationStaticParameter.TONEN == null)
            ApplicationStaticParameter.TONEN = "";
        if (ApplicationStaticParameter.DEVICE_TOKEN == null)
            ApplicationStaticParameter.DEVICE_TOKEN = "";
        if (ApplicationStaticParameter.URL == null) {
            ApplicationStaticParameter.URL = "";
            int ntk_url_count = Preferences.with(this).debugInfo().count();
            if (ntk_url_count > 0) {
                ApplicationStaticParameter.URL = Preferences.with(this).debugInfo().url();
                Preferences.with(this).debugInfo().setCount(--ntk_url_count);
            }
        }
        if (ApplicationStaticParameter.PACKAGE_NAME == null)
            ApplicationStaticParameter.PACKAGE_NAME = "";
        int ntk_url_count = Preferences.with(this).debugInfo().count();
        if (ntk_url_count > 0)
            ApplicationStaticParameter.PACKAGE_NAME = Preferences.with(this).debugInfo().packageName();

        return config;
    }

    public abstract String getLanguage();
}
