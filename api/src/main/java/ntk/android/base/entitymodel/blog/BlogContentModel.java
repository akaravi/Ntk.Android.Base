package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BlogContentModel extends BaseModuleEntity<Long> {

    @SerializedName("linkCategoryId")
    public long linkCategoryId;
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("body")
    public String body;
    @SerializedName("fromDate")
    public String fromDate;
    @SerializedName("geolocationlatitude")
    public long geolocationlatitude;
    @SerializedName("geolocationlongitude")
    public long geolocationlongitude;
    @SerializedName("keyword")
    public String keyword;
    @SerializedName("linkFileIds")
    public String linkFileIds;
    @SerializedName("linkFilePodcastId")
    public long linkFilePodcastId;
    @SerializedName("linkFileMovieId")
    public long linkFileMovieId;
    @SerializedName("linkMainImageId")
    public long linkMainImageId;
    @SerializedName("scoreClick")
    public long scoreClick;
    @SerializedName("scoreSumPercent")
    public long scoreSumPercent;
    @SerializedName("viewCount")
    public int viewCount;
    @SerializedName("favorited")
    public boolean favorited;
    @SerializedName("mainImageSrc")
    public String mainImageSrc;
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
    @SerializedName("virtual_Category")
    public BlogCategoryModel virtual_Category;
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
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("LinkFilePodcastId")
    public long LinkFilePodcastId;
    @SerializedName("LinkFileMovieId")
    public long LinkFileMovieId;
    @SerializedName("ScoreSumPercent")
    public long ScoreSumPercent;
    @SerializedName("ViewCount")
    public long ViewCount;
    @SerializedName("LinkFilePodcastIdSrc")
    public String LinkFilePodcastIdSrc;
    @SerializedName("LinkFileMovieIdSrc")
    public String LinkFileMovieIdSrc;
    @SerializedName("LinkFileIdsSrc")
    public List<String> LinkFileIdsSrc;
}
