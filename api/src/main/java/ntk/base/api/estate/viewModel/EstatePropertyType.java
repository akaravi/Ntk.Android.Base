package ntk.base.api.estate.viewModel;

import com.google.gson.annotations.SerializedName;

public class EstatePropertyType {

//    نوع ملک

    @SerializedName("Title")
    public String Title;

    @SerializedName("LinkLocationId")
    public String LinkLocationId;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkMainImageId")
    public int LinkMainImageId;

    @SerializedName("PropertyDetails")
    public EstatePropertyDetail PropertyDetails;

    @SerializedName("LinkSiteId")
    public int LinkSiteId;

    @SerializedName("Id")
    public int Id;

    @SerializedName("CreatedDate")
    public String CreatedDate;

    @SerializedName("CreatedBy")
    public int CreatedBy;

    @SerializedName("UpdatedDate")
    public String UpdatedDate;

    @SerializedName("UpdatedBy")
    public Long UpdatedBy;

    @SerializedName("DataMemoId")
    public Long DataMemoId;

    @SerializedName("RecordStatus")
    public int RecordStatus;
}
