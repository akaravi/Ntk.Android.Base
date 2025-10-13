package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

public class BaseEntityCategory<TKey> extends BaseModuleEntity<TKey> {
    @SerializedName("Title")
    public
    String Title;
    @SerializedName("LinkMainImageId")
    public long LinkMainImageId;
    @SerializedName("Description")
    public String Description;
    @SerializedName("FontIcon")
    public String FontIcon;
    @SerializedName("LinkParentId")
    public TKey LinkParentId;
    @SerializedName("LinkParentIdNode")
    public String LinkParentIdNode;
    @SerializedName("LinkMainImageIdSrc")
    public String LinkMainImageIdSrc;
}
