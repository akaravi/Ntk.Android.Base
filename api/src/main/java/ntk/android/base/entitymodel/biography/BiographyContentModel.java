package ntk.android.base.entitymodel.biography;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.core.CoreUserModel;

public class BiographyContentModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkCategoryId")
    public long LinkCategoryId;
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("Body")
    public String Body;
    @SerializedName("FromDate")
    public String FromDate;
    @SerializedName("Geolocationlatitude")
    public Double Geolocationlatitude;
    @SerializedName("Geolocationlongitude")
    public Double Geolocationlongitude;
    @SerializedName("Keyword")
    public String Keyword;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("LinkFilePodcastId")
    public long LinkFilePodcastId;
    @SerializedName("LinkFileMovieId")
    public long LinkFileMovieId;
    @SerializedName("LinkMainImageId")
    public long LinkMainImageId;
    @SerializedName("ScoreClick")
    public long ScoreClick;
    @SerializedName("ScoreSumPercent")
    public long ScoreSumPercent;
    @SerializedName("ViewCount")
    public int ViewCount;
    @SerializedName("Favorited")
    public boolean Favorited;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("ModuleCoreCreatedBy")
    public CoreUserModel ModuleCoreCreatedBy;
    @SerializedName("ModuleCoreUpdatedBy")
    public CoreUserModel ModuleCoreUpdatedBy;
    @SerializedName("Source")
    public String Source;
    @SerializedName("Comments")
    public BiographyCommentModel Comments;
    @SerializedName("virtual_Category")
    public BiographyCategoryModel virtual_Category;
    @SerializedName("Category")
    public BiographyCategoryModel Category;
    @SerializedName("ContentTags")
    public List<BiographyContentTagModel> ContentTags;
    @SerializedName("Similars")
    public List<BiographyContentSimilarModel> Similars;
    @SerializedName("OtherInfos")
    public String OtherInfos;
    @SerializedName("ContentAndParameterValues")
    public Object ContentAndParameterValues;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;
    @SerializedName("LinkFileMovieIdSrc")
    public String LinkFileMovieIdSrc;
    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
    @SerializedName("LocationPeriodStart")
    public long LocationPeriodStart;
    @SerializedName("LocationPeriodEnd")
    public long LocationPeriodEnd;
    @SerializedName("DatePeriodStart")
    public String DatePeriodStart;
    @SerializedName("DatePeriodEnd")
    public String DatePeriodEnd;
}
