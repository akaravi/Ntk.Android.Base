package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.base.feildinfo.GetPropertiesInfoModel;
import ntk.android.base.entitymodel.enums.EnumBuildStatusType;

public class ApplicationAppModel extends BaseModuleEntity<Long> {


    @SerializedName("LinkSiteId")
    public Long LinkSiteId;
    @SerializedName("AppKey")
    public String AppKey;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("LinkFileIdIcon")
    public Long LinkFileIdIcon;
    @SerializedName("LinkFileIdLogo")
    public Long LinkFileIdLogo;
    @SerializedName("LinkFileIdSplashScreen")
    public Long LinkFileIdSplashScreen;
    @SerializedName("Title")
    public String Title;
    @SerializedName("AppVersion")
    public int AppVersion;
    @SerializedName("IsPublished")
    public boolean IsPublished;
    @SerializedName("LinkSourceId")
    public Long LinkSourceId;
    @SerializedName("Virtual_Source")
    public ApplicationSourceModel Virtual_Source;
    @SerializedName("Source")
    public ApplicationSourceModel Source;
    @SerializedName("DownloadCount")
    public int DownloadCount;
    @SerializedName("IsGlobalUser")
    public boolean IsGlobalUser;
    @SerializedName("CheckUpdate")
    public boolean CheckUpdate;
    @SerializedName("ForceUpdate")
    public boolean ForceUpdate;
    @SerializedName("QrCode")
    public String QrCode;
    @SerializedName("LastBuildAppKey")
    public String LastBuildAppKey;
    @SerializedName("LastBuildStatus")
    public EnumBuildStatusType LastBuildStatus;
    @SerializedName("LastNotificationOrderDate")
    public String LastNotificationOrderDate;
    @SerializedName("LastBuildOrderDate")
    public String LastBuildOrderDate;
    @SerializedName("LastBuildRunDate")
    public String LastBuildRunDate;
    @SerializedName("LastBuildEndDate")
    public String LastBuildEndDate;
    @SerializedName("LastBuildErrorMessage")
    public String LastBuildErrorMessage;
    @SerializedName("LastSuccessfullyBuildDate")
    public String LastSuccessfullyBuildDate;
    @SerializedName("LayoutValues")
    public List<ApplicationLayoutValueModel> LayoutValues;
    @SerializedName("BuildCount")
    public int BuildCount;
    @SerializedName("LinkThemeConfigId")
    public Long LinkThemeConfigId;
    @SerializedName("Virtual_ThemeConfig")
    public ApplicationThemeConfigModel Virtual_ThemeConfig;
    @SerializedName("ThemeConfig")
    public ApplicationThemeConfigModel ThemeConfig;
    @SerializedName("ConfigBuilderAdminJsonValues")
    public String ConfigBuilderAdminJsonValues;
    @SerializedName("ConfigRuntimeAdminJsonValues")
    public String ConfigRuntimeAdminJsonValues;
    @SerializedName("ConfigBuilderSiteJsonValues")
    public String ConfigBuilderSiteJsonValues;
    @SerializedName("ConfigRuntimeSiteJsonValues")
    public String ConfigRuntimeSiteJsonValues;
    @SerializedName("ScoreClick")
    public int ScoreClick;
    @SerializedName("ScoreSumPercent")
    public Long ScoreSumPercent;
    @SerializedName("AdminConfigFormFormatter")
    public List<GetPropertiesInfoModel> AdminConfigFormFormatter;
    @SerializedName("userConfigFormFormatter")
    public List<GetPropertiesInfoModel> UserConfigFormFormatter;
    @SerializedName("ThemeConfigJsonValues")
    public String ThemeConfigJsonValues;
    @SerializedName("BuildKey1String")
    public String BuildKey1String;
    @SerializedName("BuildKey1Value")
    public String BuildKey1Value;
    @SerializedName("BuildKey2String")
    public String BuildKey2String;
    @SerializedName("BuildKey2Value")
    public String BuildKey2Value;
    @SerializedName("BuildKey3String")
    public String BuildKey3String;
    @SerializedName("BuildKey3Value")
    public String BuildKey3Value;
    @SerializedName("BuildKey4String")
    public String BuildKey4String;
    @SerializedName("BuildKey4Value")
    public String BuildKey4Value;
    @SerializedName("BuildKey5String")
    public String BuildKey5String;
    @SerializedName("BuildKey5Value")
    public String BuildKey5Value;
    @SerializedName("DownloadLinkSrcCustomize")
    public String DownloadLinkSrcCustomize;
    @SerializedName("downloadLinksrc")
    public String DownloadLinksrc;
    @SerializedName("DownloadLinksrcByDomain")
    public String DownloadLinksrcByDomain;
    @SerializedName("FilePathOnServer")
    public String FilePathOnServer;

}
