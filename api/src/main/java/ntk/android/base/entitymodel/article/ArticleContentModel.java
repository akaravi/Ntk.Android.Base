package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ArticleContentModel extends BaseModuleEntity<Long> {

    @SerializedName("LinkCategoryId")
    public long LinkCategoryId;
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("Body")
    public String Body;
    @SerializedName("FromDate")
    public String fromDate;
    @SerializedName("Geolocationlatitude")
    public long Geolocationlatitude;
    @SerializedName("Geolocationlongitude")
    public long Geolocationlongitude;
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
    public long ViewCount;
    @SerializedName("Favorited")
    public boolean Favorited;
    @SerializedName("MainImageSrc")
    public String MainImageSrc;
    @SerializedName("ExpireDate")
    public String ExpireDate;
    @SerializedName("ModuleCoreCreatedBy")
    public String ModuleCoreCreatedBy;
    @SerializedName("ModuleCoreUpdatedBy")
    public String ModuleCoreUpdatedBy;
    @SerializedName("Source")
    public String Source;
    @SerializedName("Comments")
    public String Comments;
    @SerializedName("Virtual_Category")
    public ArticleCategoryModel Virtual_Category;
    @SerializedName("Category")
    public ArticleCategoryModel Category;
    @SerializedName("ContentTags")
    public List<ArticleContentTagModel> ContentTags;
    @SerializedName("Similars")
    public List<ArticleContentSimilarModel> Similars;
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
