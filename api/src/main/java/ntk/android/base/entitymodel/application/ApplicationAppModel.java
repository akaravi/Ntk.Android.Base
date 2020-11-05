package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.base.feildinfo.GetPropertiesInfoModel;

public class ApplicationAppModel extends BaseModuleEntity<Long> {


    @SerializedName("linkSiteId")
    public long linkSiteId;
    @SerializedName("appKey")
    public String appKey;
    @SerializedName("expireDate")
    public String expireDate;
    @SerializedName("linkFileIdIcon")
    public long linkFileIdIcon;
    @SerializedName("linkFileIdLogo")
    public long linkFileIdLogo;
    @SerializedName("linkFileIdSplashScreen")
    public long linkFileIdSplashScreen;
    @SerializedName("title")
    public String title;
    @SerializedName("appVersion")
    public int appVersion;
    @SerializedName("isPublished")
    public boolean isPublished;
    @SerializedName("linkSourceId")
    public long linkSourceId;
    @SerializedName("virtual_Source")
    public ApplicationSourceModel virtual_Source;
    @SerializedName("source")
    public ApplicationSourceModel source;
    @SerializedName("downloadCount")
    public int downloadCount;
    @SerializedName("isGlobalUser")
    public boolean isGlobalUser;
    @SerializedName("checkUpdate")
    public boolean checkUpdate;
    @SerializedName("forceUpdate")
    public boolean forceUpdate;
    @SerializedName("qrCode")
    public String qrCode;
    @SerializedName("lastBuildAppKey")
    public String lastBuildAppKey;
    @SerializedName("lastBuildStatus")
    public EnumBuildStatusType lastBuildStatus;
    @SerializedName("lastNotificationOrderDate")
    public String lastNotificationOrderDate;
    @SerializedName("lastBuildOrderDate")
    public String lastBuildOrderDate;
    @SerializedName("lastBuildRunDate")
    public String lastBuildRunDate;
    @SerializedName("lastBuildEndDate")
    public String lastBuildEndDate;
    @SerializedName("lastBuildErrorMessage")
    public String lastBuildErrorMessage;
    @SerializedName("lastSuccessfullyBuildDate")
    public String lastSuccessfullyBuildDate;
    @SerializedName("layoutValues")
    public List<ApplicationLayoutValueModel> layoutValues;
    @SerializedName("buildCount")
    public int buildCount;
    @SerializedName("linkThemeConfigId")
    public long linkThemeConfigId;
    @SerializedName("virtual_ThemeConfig")
    public ApplicationThemeConfigModel virtual_ThemeConfig;
    @SerializedName("themeConfig")
    public ApplicationThemeConfigModel themeConfig;
    @SerializedName("configBuilderAdminJsonValues")
    public String configBuilderAdminJsonValues;
    @SerializedName("configRuntimeAdminJsonValues")
    public String configRuntimeAdminJsonValues;
    @SerializedName("configBuilderSiteJsonValues")
    public String configBuilderSiteJsonValues;
    @SerializedName("configRuntimeSiteJsonValues")
    public String configRuntimeSiteJsonValues;
    @SerializedName("scoreClick")
    public int scoreClick;
    @SerializedName("scoreSumPercent")
    public long scoreSumPercent;
    @SerializedName("adminConfigFormFormatter")
    public List<GetPropertiesInfoModel> adminConfigFormFormatter;
    @SerializedName("userConfigFormFormatter")
    public List<GetPropertiesInfoModel> userConfigFormFormatter;
    @SerializedName("themeConfigJsonValues")
    public String themeConfigJsonValues;
    @SerializedName("buildKey1String")
    public String buildKey1String;
    @SerializedName("buildKey1Value")
    public String buildKey1Value;
    @SerializedName("buildKey2String")
    public String buildKey2String;
    @SerializedName("buildKey2Value")
    public String buildKey2Value;
    @SerializedName("buildKey3String")
    public String buildKey3String;
    @SerializedName("buildKey3Value")
    public String buildKey3Value;
    @SerializedName("buildKey4String")
    public String buildKey4String;
    @SerializedName("buildKey4Value")
    public String buildKey4Value;
    @SerializedName("buildKey5String")
    public String buildKey5String;
    @SerializedName("buildKey5Value")
    public String buildKey5Value;
    @SerializedName("downloadLinkSrcCustomize")
    public String downloadLinkSrcCustomize;
    @SerializedName("downloadLinksrc")
    public String downloadLinksrc;
    @SerializedName("downloadLinksrcByDomain")
    public String downloadLinksrcByDomain;
    @SerializedName("filePathOnServer")
    public String filePathOnServer;

}
