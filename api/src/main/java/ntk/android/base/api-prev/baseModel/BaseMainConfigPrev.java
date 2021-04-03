package ntk.android.base.api.baseModel;

import com.google.gson.annotations.SerializedName;

public class BaseMainConfigPrev {

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
