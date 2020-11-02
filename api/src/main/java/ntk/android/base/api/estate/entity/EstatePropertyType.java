package ntk.android.base.api.estate.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.BaseEntity;

public class EstatePropertyType extends BaseEntity {

    //    نوع ملک
    @SerializedName("Id")
    public String Id;

    @SerializedName("Title")
    public String Title;

    @SerializedName("TitleCreatedYaer")
    public String TitleCreatedYaer;

    @SerializedName("TitlePartition")
    public String TitlePartition;

    @SerializedName("LinkLocationId")
    public String LinkLocationId;

    @SerializedName("Description")
    public String Description;

    @SerializedName("LinkMainImageId")
    public int LinkMainImageId;

    @SerializedName("PropertyDetails")
    public List<EstatePropertyDetail> PropertyDetails;

}