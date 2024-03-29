package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.enums.EnumRecordStatus;

public class EstatePropertyModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("CaseCode")
    public String CaseCode;
    EnumRecordStatus MainAdminRecordStatus;
    @SerializedName("CreatedYaer")
    public int CreatedYaer;
    @SerializedName("Partition")
    public int Partition;
    @SerializedName("Area")
    public double Area;
    @SerializedName("LinkEstateUserId")
    public String LinkEstateUserId;

    @SerializedName("LinkLocationId")
    public int LinkLocationId;
    @SerializedName("Description")
    public String Description;
    @SerializedName("ViewConfigHiddenInList")
    public boolean ViewConfigHiddenInList;
    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;
    @SerializedName("LinkPropertyTypeLanduseId")
    public String LinkPropertyTypeLanduseId;
    @SerializedName("LinkPropertyTypeUsageId")
    public String LinkPropertyTypeUsageId;
    @SerializedName("PropertyTypeLanduse")
    public EstatePropertyTypeLanduseModel PropertyTypeLanduse;
    @SerializedName("PropertyTypeUsage")
    public EstatePropertyTypeUsageModel PropertyTypeUsage;
    @SerializedName("Favorited")
    public boolean IsFavorite;
    /// <summary>@NOTIC must be integer
    /// موقعیت جغرافیایی
    /// </summary>
    @SerializedName("Geolocationlatitude")
    public Double Geolocationlatitude;

    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;

    @SerializedName("Address")
    public String Address;

    @SerializedName("LinkMainImageId")
    public int LinkMainImageId;
    @SerializedName("LinkExtraImageIds")
    public String LinkExtraImageIds;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    /// <summary>
    /// تعداد مجموع آرا
    /// </summary>

    @SerializedName("ScoreClick")
    public long ScoreClick;
    /// <summary>
    /// مجموع امتیازهای داده شده در آراها
    /// امتیاز از 10 می باشد
    /// </summary>

    @SerializedName("ScoreSumPercent")
    public long ScoreSumPercent;
    @SerializedName("ViewCount")
    public int ViewCount;
    // * AboutAgent */
    @SerializedName("AboutAgentTel")
    public String AboutAgentTel;
    @SerializedName("AboutAgentMobile")
    public String AboutAgentMobile;
    // * AboutAgent */
    // * AboutCustomer */
    @SerializedName("AboutCustomerTel")
    public String AboutCustomerTel;
    @SerializedName("AboutCustomerMobile")
    public String AboutCustomerMobile;
    // * AboutCustomer */
    @SerializedName("Contracts")
    public List<EstateContractModel> Contracts;

    @SerializedName("PropertyDetailValues")
    public List<EstatePropertyDetailValueModel> PropertyDetailValues;
    @SerializedName("PropertyDetailGroups")
    public List<EstatePropertyDetailGroupModel> PropertyDetailGroups;

    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
    @SerializedName("LinkExtraImageIdsSrc")
    public List<String> LinkExtraImageIdsSrc;
    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
    /**
     * برای انتصا مسقیم فایل آپلود شده
     */
    @SerializedName("UploadFileGUID")
    public List<String> UploadFileGUID;
    @SerializedName("UrlViewContent")
    public String UrlViewContent;
    @SerializedName("UrlViewContentQRCodeBase64")
    public String UrlViewContentQRCodeBase64;
    @SerializedName("LinkLocationIdTitle")
    public String LinkLocationIdTitle;
    @SerializedName("LinkLocationIdParentTitle")
    public String LinkLocationIdParentTitle;
    @SerializedName("SharingKey")
    public String SharingKey;
    @SerializedName("SharingId")
    public Long SharingId;
}
