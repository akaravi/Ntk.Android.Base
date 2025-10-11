package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.base.feildinfo.GetPropertiesInfoModel;
import ntk.android.base.entitymodel.enums.EnumBuildStatusType;

public class ApplicationAppModel extends BaseModuleEntity<Long> {
    @SerializedName("AppKey")
    public String AppKey;
    @SerializedName("Lang")
    public int Lang;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("LinkFileIdIcon")
    public Long LinkFileIdIcon;
    @SerializedName("LinkFileIdLogo")
    public Long LinkFileIdLogo;
    @SerializedName("LinkFileIdSplashScreen")
    public Long LinkFileIdSplashScreen;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;
    @SerializedName("Title")
    public String Title;
    @SerializedName("AppVersion")
    public int AppVersion;
    @SerializedName("IsPublished")
    public String IsPublished;

    @SerializedName("IsPublic")
    public boolean IsPublic;
    @SerializedName("AllowDirectShareApp")
    public boolean AllowDirectShareApp;
    @SerializedName("LinkSourceId")
    public Long LinkSourceId;
    @SerializedName(" virtual_Source")
    public ApplicationSourceModel virtual_Source;
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
    @SerializedName(" virtual_ThemeConfig")
    public ApplicationThemeConfigModel virtual_ThemeConfig;
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
    @SerializedName("DownloadLinkSrc")
    public String DownloadLinkSrc;
    @SerializedName("DownloadLinkUpdateSrc")
    public String DownloadLinkUpdateSrc;
    @SerializedName("DownloadLinkSrcQRCodeBase64")
    public String DownloadLinkSrcQRCodeBase64;

    @SerializedName("FilePathOnServer")
    public String FilePathOnServer;

    @SerializedName("AboutUsTitle")
    public String AboutUsTitle;
    @SerializedName("AboutUsDescription")
    public String AboutUsDescription;
    @SerializedName("AboutUsTel")
    public String AboutUsTel;
    @SerializedName("AboutUsMobile")
    public String AboutUsMobile;
    @SerializedName("AboutUsLinkImageIdSrc")
    public String AboutUsLinkImageIdSrc;
    @SerializedName("AboutUsFax")
    public String AboutUsFax;
    @SerializedName("AboutUsEmail")
    public String AboutUsEmail;
    @SerializedName("AboutUsAddress")
    public String AboutUsAddress;
    @SerializedName("AboutUsLinkImageId")
    public String AboutUsLinkImageId;
    @SerializedName("AboutUsGeolocationlatetitude")
    public String AboutUsGeolocationlatetitude;
    @SerializedName("AboutUsGeolocationlongitude")
    public String AboutUsGeolocationlongitude;
    @SerializedName("AboutUsLinkFacebook")
    public String AboutUsLinkFacebook;
    @SerializedName("AboutUsLinkTwitter")
    public String AboutUsLinkTwitter;
    @SerializedName("AboutUsLinkGooglePlus")
    public String AboutUsLinkGooglePlus;
    @SerializedName("AboutUsLinkInstagram")
    public String AboutUsLinkInstagram;
    @SerializedName("AboutUsLinklinkedin")
    public String AboutUsLinklinkedin;
    @SerializedName("AboutUsLinkYahoo")
    public String AboutUsLinkYahoo;
    @SerializedName("AboutUsLinkYoutube")
    public String AboutUsLinkYoutube;
    @SerializedName("AboutUsLinkTelegram")
    public String AboutUsLinkTelegram;
    @SerializedName("AboutUsLinkPinterest")
    public String AboutUsLinkPinterest;
    @SerializedName("AboutUsLinkRss")
    public String AboutUsLinkRss;
    @SerializedName("LinkFileIdIconSrc")
    public String LinkFileIdIconSrc;
    @SerializedName("LinkFileIdLogoSrc")
    public String LinkFileIdLogoSrc;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
    @SerializedName("AboutUsPrivacyPolicyHtmlBody")
    public String AboutUsPrivacyPolicyHtmlBody;

}
