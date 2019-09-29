package ntk.base.api.core.viewModel;

import com.google.gson.annotations.SerializedName;

public class CoreMain {

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
