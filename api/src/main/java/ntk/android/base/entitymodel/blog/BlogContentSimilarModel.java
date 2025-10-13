package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BlogContentSimilarModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("LinkSourceid")
    public String LinkSourceid;
    @SerializedName("LinkDestinationid")
    public String LinkDestinationid;
    @SerializedName(" virtual_Source")
    public String  virtual_Source;
    @SerializedName("Source")
    public String Source;
    @SerializedName(" virtual_Destination")
    public String  virtual_Destination;
    @SerializedName("Destination")
    public String Destination;
}
