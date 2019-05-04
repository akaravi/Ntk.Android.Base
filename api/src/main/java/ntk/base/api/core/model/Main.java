package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

public class Main {

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
    public int AppThemeId;

}
