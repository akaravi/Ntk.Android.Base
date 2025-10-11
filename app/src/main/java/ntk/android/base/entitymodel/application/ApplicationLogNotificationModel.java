package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.enums.EnumNotificationType;

class ApplicationLogNotificationModel extends BaseModuleEntity<Long> {

    @SerializedName("LinkApplicationMemberId")
    public Long LinkApplicationMemberId;
    @SerializedName("MemberInfo")
    public ApplicationMemberInfoModel MemberInfo;
    @SerializedName("LinkApplicationId")
    public Long LinkApplicationId;
    @SerializedName("Application")
    public ApplicationAppModel Application;
    @SerializedName("Title")
    public String Title;
    @SerializedName("Content")
    public String Content;
    @SerializedName("ContentType")
    public EnumNotificationType ContentType;
    @SerializedName("contentJson")
    public String ContentJson;
    @SerializedName("ContentJsonClass")
    public String ContentJsonClass;
    @SerializedName("SmallImageId")
    public long SmallImageId;
    @SerializedName("BigImageId")
    public long BigImageId;
    @SerializedName("SmallImageIdSrc")
    public String SmallImageIdSrc;
    @SerializedName("BigImageIdSrc")
    public String BigImageIdSrc;
}