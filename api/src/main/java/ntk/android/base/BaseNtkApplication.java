package ntk.android.base;

import android.content.Context;

import androidx.multidex.MultiDexApplication;

import java.io.File;


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
        if (config.TONEN == null)
            config.TONEN = "";
        if (config.DEVICE_TOKEN == null)
            config.DEVICE_TOKEN = "";
        if (config.URL == null)
            config.URL = "";
        return config;
    }
}
