package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

class ApplicationSourceModel extends BaseModuleEntity<Long> {

    @SerializedName("title")
    public String title;
    @SerializedName("linkMainImageId")
    public Long linkMainImageId;
    @SerializedName("defaultAppId")
    public Long defaultAppId;
    @SerializedName("className")
    public String className;
    @SerializedName("packageName")
    public String packageName;
    @SerializedName("forceUpdate")
    public Boolean forceUpdate;
    @SerializedName("linkLastSuccessfullyBuildFileId")
    public Long linkLastSuccessfullyBuildFileId;
    @SerializedName("lastSuccessfullyBuildDate")
    public String lastSuccessfullyBuildDate;
    @SerializedName("lastBuildCommandDate")
    public String lastBuildCommandDate;
    @SerializedName("lastBuildCommandBy")
    public String lastBuildCommandBy;
    @SerializedName("lastUnsuccessfullyBuildErrorDate")
    public String lastUnsuccessfullyBuildErrorDate;
    @SerializedName("lastUnsuccessfullyBuildErrorMessage")
    public String lastUnsuccessfullyBuildErrorMessage;
    @SerializedName("layouts")
    public List<ApplicationLayoutModel> layouts;
    @SerializedName("applications")
    public List<ApplicationAppModel> applications;
    @SerializedName("fireBaseServerKey")
    public String fireBaseServerKey;
    @SerializedName("defaultConfigBuilderAdminJsonValues")
    public String defaultConfigBuilderAdminJsonValues;
    @SerializedName("defaultConfigRuntimeAdminJsonValues")
    public String defaultConfigRuntimeAdminJsonValues;
    @SerializedName("defaultConfigBuilderSiteJsonValues")
    public String defaultConfigBuilderSiteJsonValues;
    @SerializedName("defaultConfigRuntimeSiteJsonValues")
    public String defaultConfigRuntimeSiteJsonValues;
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
    @SerializedName("isPublish")
    public Boolean isPublish;
    @SerializedName("sourceNameGit")
    public String sourceNameGit;
    @SerializedName("osType;")
    public int osType;
    @SerializedName("updateSourceByGit")
    public Boolean updateSourceByGit;
    @SerializedName("isAbilityGradleBuild")
    public boolean isAbilityGradleBuild;
    @SerializedName("filePathOnServer")
    public String filePathOnServer;


}