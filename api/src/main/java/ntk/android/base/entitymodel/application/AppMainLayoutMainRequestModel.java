package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class AppMainLayoutMainRequestModel extends BaseModuleEntity<Long> {


    @SerializedName("userId")
    public long userId;
    @SerializedName("memberUserId")
    public long memberUserId;
    @SerializedName("siteId")
    public String siteId;
    @SerializedName("appTitle")
    public String appTitle;
    @SerializedName("appUrl")
    public String appUrl;
    @SerializedName("appId")
    public long appId;
    @SerializedName("appVersion")
    public int appVersion;
    @SerializedName("lastUpdateSource")
    public String lastUpdateSource;
    @SerializedName("lastUpdateTheme")
    public String lastUpdateTheme;
    @SerializedName("lastUpdateApp")
    public String lastUpdateApp;
    @SerializedName("appForceUpdate")
    public boolean appForceUpdate;
    @SerializedName("appThemeId")
    public Long appThemeId;
}

