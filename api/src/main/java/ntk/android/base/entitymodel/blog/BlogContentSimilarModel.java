package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BlogContentSimilarModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("linkSourceid")
    public String linkSourceid;
    @SerializedName("linkDestinationid")
    public String linkDestinationid;
    @SerializedName("virtual_Source")
    public String virtual_Source;
    @SerializedName("source")
    public String source;
    @SerializedName("virtual_Destination")
    public String virtual_Destination;
    @SerializedName("destination")
    public String destination;
}
