package ntk.android.base.api.baseModel;

import com.google.gson.annotations.SerializedName;

public class BaseEntityPrev {
    @SerializedName("LinkSiteId")
    public Long LinkSiteId;

    @SerializedName("RecordStatus")
    public int RecordStatus;

    @SerializedName("CreatedDate")
    public String CreatedDate;

    @SerializedName("CreatedBy")
    public Long CreatedBy;

    @SerializedName("UpdatedDate")
    public String UpdatedDate;

    @SerializedName("UpdatedBy")
    public Long UpdatedBy;


}
