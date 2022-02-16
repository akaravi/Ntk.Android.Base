package ntk.android.base.appclass;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.application.ApplicationAppModel;

public class UpdateClass {
    @SerializedName("checkUpdate")
    public boolean checkUpdate;
    @SerializedName("isForced")
    public boolean isForced;
    @SerializedName("url")
    public String url;
    @SerializedName("version")
    public int version;
    @SerializedName("allowDirectShareApp")
    public boolean allowDirectShareApp;
    @SerializedName("downloadLinkSrcQRCodeBase64")
    public String downloadLinkSrcQRCodeBase64;

    public UpdateClass(ApplicationAppModel item) {
        this.isForced=item.ForceUpdate;
        this.version=item.AppVersion;
        this.checkUpdate=item.CheckUpdate;
        this.url=item.DownloadLinkUpdateSrc;
        this.allowDirectShareApp=item.AllowDirectShareApp;
        this.downloadLinkSrcQRCodeBase64=item.DownloadLinkSrcQRCodeBase64;
    }
}
