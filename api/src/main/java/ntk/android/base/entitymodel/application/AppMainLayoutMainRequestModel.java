package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class AppMainLayoutMainRequestModel extends BaseModuleEntity<Long> {


    @SerializedName("UserId")
    public long UserId;
    @SerializedName("MemberUserId")
    public long MemberUserId;
    @SerializedName("SiteId")
    public String SiteId;
    @SerializedName("AppTitle")
    public String AppTitle;
    @SerializedName("AppUrl")
    public String AppUrl;
    @SerializedName("AppId")
    public long AppId;
    @SerializedName("AppVersion")
    public int AppVersion;
    @SerializedName("LastUpdateSource")
    public String LastUpdateSource;
    @SerializedName("LastUpdateTheme")
    public String LastUpdateTheme;
    @SerializedName("LastUpdateApp")
    public String LastUpdateApp;
    @SerializedName("AppForceUpdate")
    public boolean AppForceUpdate;
    @SerializedName("AppThemeId")
    public Long AppThemeId;
}

