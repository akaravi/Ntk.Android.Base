package ntk.android.base.appclass;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.application.ApplicationAppModel;

public class UpdateClass {
    @SerializedName("isForced")
    public boolean isForced;
    @SerializedName("url")
    public String url;
    @SerializedName("version")
    public int version;

    public UpdateClass(ApplicationAppModel item) {
        this.isForced=item.ForceUpdate;
        this.version=item.AppVersion;
        this.url=item.DownloadLinkUpdateSrcByDomain;
    }
}
