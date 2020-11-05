package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.enums.EnumNotificationType;

class ApplicationLogNotificationModel extends BaseModuleEntity<Long> {

    @SerializedName("linkApplicationMemberId")
    public
    Long linkApplicationMemberId;
    @SerializedName("memberInfo")
    public ApplicationMemberInfoModel memberInfo;
    @SerializedName("linkApplicationId")
    public Long linkApplicationId;
    @SerializedName("application")
    public ApplicationAppModel application;
    @SerializedName("title")
    public String title;
    @SerializedName("content")
    public String content;
    @SerializedName("contentType")
    public EnumNotificationType contentType;
    @SerializedName("contentJson")
    public String contentJson;
    @SerializedName("contentJsonClass")
    public String contentJsonClass;
    @SerializedName("smallImageId")
    public long smallImageId;
    @SerializedName("bigImageId")
    public long bigImageId;
    @SerializedName("smallImageIdSrc")
    public String smallImageIdSrc;
    @SerializedName("bigImageIdSrc")
    public String bigImageIdSrc;
}