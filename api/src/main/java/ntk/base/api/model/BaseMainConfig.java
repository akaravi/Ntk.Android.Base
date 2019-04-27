package ntk.base.api.model;

import com.google.gson.annotations.SerializedName;

public class BaseMainConfig {

    @SerializedName("AppTitle")
    public boolean AppTitle;

    @SerializedName("AppUrl")
    public String AppUrl;

    @SerializedName("AppId")
    public long AppId;

    @SerializedName("AppVersion")
    public long AppVersion;

    @SerializedName("AppForceUpdate")
    public boolean AppForceUpdate;

    @SerializedName("AppThemeId")
    public long AppThemeId;

}
