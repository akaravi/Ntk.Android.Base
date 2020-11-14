package ntk.android.base.dtomodel.application;

import com.google.gson.annotations.SerializedName;

public class MainResponseDtoModel {
    @SerializedName("AppTitle")
    public String AppTitle;

    @SerializedName("AppUrl")
    public String AppUrl;

    @SerializedName("AppId")
    public int AppId;

    @SerializedName("AppVersion")
    public int AppVersion;

    @SerializedName("AppForceUpdate")
    public boolean AppForceUpdate;

    @SerializedName("AppThemeId")
    public long AppThemeId;


    @SerializedName("UserId")
    public long UserId;
    @SerializedName("MemberUserId")
    public long MemberUserId ;
    @SerializedName("SiteId")
    public long SiteId ;



    @SerializedName("LastUpdateSource")
    public String LastUpdateSource ;
    @SerializedName("LastUpdateTheme")
    public String LastUpdateTheme ;
    @SerializedName("LastUpdateApp")
    public String LastUpdateApp ;

}
