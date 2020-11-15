package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ArticleContentSimilarModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("LinkSourceid")
    public String LinkSourceid;
    @SerializedName("LinkDestinationid")
    public String LinkDestinationid;
    @SerializedName("Virtual_Source")
    public String Virtual_Source;
    @SerializedName("Source")
    public String Source;
    @SerializedName("Virtual_Destination")
    public String Virtual_Destination;
    @SerializedName("Destination")
    public String Destination;
}
