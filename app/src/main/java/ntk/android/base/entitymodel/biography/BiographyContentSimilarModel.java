package ntk.android.base.entitymodel.biography;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BiographyContentSimilarModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("LinkSourceId")
    public long LinkSourceId;
    @SerializedName("LinkDestinationId")
    public long LinkDestinationId;
    @SerializedName("virtual_Source")
    public Object virtual_Source;
    @SerializedName("Source")
    public Object Source;
    @SerializedName("virtual_Destination")
    public Object virtual_Destination;
    @SerializedName("Destination")
    public Object Destination;
}