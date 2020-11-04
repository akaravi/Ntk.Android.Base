package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

public class BaseEntityCategory<TKey> extends BaseModuleEntity<TKey> {
    @SerializedName("Title")
    String Title;
    @SerializedName("LinkMainImageId")
    long LinkMainImageId;
    @SerializedName("Description")
    String Description;
    @SerializedName("FontIcon")
    String FontIcon;
    @SerializedName("LinkParentId")
    TKey LinkParentId;
    @SerializedName("LinkParentIdNode")
    String LinkParentIdNode;
    @SerializedName("LinkMainImageSrc")
    String LinkMainImageSrc;
}
