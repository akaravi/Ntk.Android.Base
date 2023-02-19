package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.core.File360ViewModel;
import ntk.android.base.entitymodel.enums.EnumRecordStatus;

public class EstatePropertyProjectModel {
    @SerializedName("Title")
    public String Title;
    @SerializedName("LinkCmsUserId")
    public Long LinkCmsUserId;
    @SerializedName("MainAdminRecordStatus")
    public String MainAdminRecordStatus;
    @SerializedName("LinkPropertyCompanyId")
    public String LinkPropertyCompanyId;
    @SerializedName("Description")
    public String Description;
    @SerializedName("Address")
    public String Address;
    @SerializedName("Body")
    public String Body;
    @SerializedName("Geolocationlatitude")
    public Long Geolocationlatitude;
    @SerializedName("Geolocationlongitude")
    public Long Geolocationlongitude;
    @SerializedName("LinkLocationId")
    public Integer LinkLocationId;
    @SerializedName("Keyword")
    public String Keyword;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("LinkExtraImageIds")
    public String LinkExtraImageIds;
    @SerializedName("LinkFilePodcastId")
    public Long LinkFilePodcastId;
    @SerializedName("LinkFileMovieId")
    public Long LinkFileMovieId;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;
    @SerializedName("File360Views")
    public List<File360ViewModel>File360Views;
    @SerializedName("ScoreClick")
    public long ScoreClick;
    @SerializedName("ScoreSumPercent")
    public long ScoreSumPercent;
    @SerializedName("ViewCount")
    public long ViewCount;
    @SerializedName("ViewConfigHiddenInList")
    public boolean ViewConfigHiddenInList;
    @SerializedName("Favorited")
    public boolean Favorited;
    @SerializedName("Source")
    public String Source;
    @SerializedName("FromDate")
    public String fromDate;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("LinkLocationCountryId")
    public Long LinkLocationCountryId;


    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;
    @SerializedName("LinkFileMovieIdSrc")
    public String LinkFileMovieIdSrc;
    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
    @SerializedName("LinkExtraImageIdsSrc")
    public List<String> LinkExtraImageIdsSrc;


    @SerializedName("UploadFileGUID")
    public List<String> UploadFileGUID;
    @SerializedName("UrlViewContent")
    public String UrlViewContent;
    @SerializedName("UrlViewContentShort")
    public String UrlViewContentShort;
    @SerializedName("UrlViewContentQRCodeBase64")
    public String UrlViewContentQRCodeBase64;
    @SerializedName("LinkLocationCountryIdTitle")
    public String LinkLocationCountryIdTitle;
    @SerializedName("LinkLocationIdTitle")
    public String LinkLocationIdTitle;
    @SerializedName("LinkLocationIdParentTitle")
    public String LinkLocationIdParentTitle;

    // * About */
    @SerializedName("AboutTel")
    public String AboutTel;
    @SerializedName("AboutMobile")
    public String AboutMobile;
    // * About */


}
