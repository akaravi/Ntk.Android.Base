package ntk.base.api.model;

import com.google.gson.annotations.SerializedName;

public class BaseEntity {
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

    @SerializedName("DataMemoId")
    public Long DataMemoId;
}
