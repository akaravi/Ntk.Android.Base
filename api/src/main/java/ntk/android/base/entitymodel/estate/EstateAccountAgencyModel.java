package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.enums.EnumRecordStatus;

public class EstateAccountAgencyModel extends BaseModuleEntity<String> {
    EnumRecordStatus MainAdminRecordStatus;
    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("LinkLocationId")
    public Integer LinkLocationId;
    @SerializedName("Geolocationlatitude")
    public Double Geolocationlatitude;
    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;

    @SerializedName("Address")
    public String Address;
    @SerializedName("PhoneNumber")
    public String PhoneNumber;
    @SerializedName("LinkMainImageId")
    public long LinkMainImageId;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;

    @SerializedName("LinkExtraImageIds")
    public String LinkExtraImageIds;
    @SerializedName("LinkExtraImageIdsSrc")
    public List<String> LinkExtraImageIdsSrc;
}
