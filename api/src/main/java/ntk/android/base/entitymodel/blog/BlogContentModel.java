package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;
import ntk.android.base.entitymodel.core.CoreUserModel;

public class BlogContentModel extends BaseModuleEntity<Long> {

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
    public Double Golocationlatitude;
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
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("ModuleCoreCreatedBy")
    public CoreUserModel ModuleCoreCreatedBy;
    @SerializedName("ModuleCoreUpdatedBy")
    public CoreUserModel ModuleCoreUpdatedBy;
    @SerializedName("Source")
    public String Source;
    @SerializedName("Comments")
    public String Comments;
    @SerializedName(" virtual_Category")
    public BlogCategoryModel  virtual_Category;
    @SerializedName("Category")
    public BlogCategoryModel Category;
    @SerializedName("ContentTags")
    public List<BlogContentTagModel> ContentTags;
    @SerializedName("Similars")
    public List<BlogContentSimilarModel> Similars;
    @SerializedName("OtherInfos")
    public String OtherInfos;
    @SerializedName("ContentAndParameterValues")
    public Object ContentAndParameterValues;
    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;
    @SerializedName("LinkFileMovieIdSrc")
    public String LinkFileMovieIdSrc;
    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}
