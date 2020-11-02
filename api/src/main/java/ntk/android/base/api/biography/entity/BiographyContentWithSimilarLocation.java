package ntk.android.base.api.biography.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

class BiographyContentWithSimilarLocation extends BaseEntity {

    @SerializedName("ExpireDate")
    public String ExpireDate;

    @SerializedName("DatePeriodStart")
    public String DatePeriodStart;

    @SerializedName("DatePeriodEnd")
    public String DatePeriodEnd;

    @SerializedName("Source")
    public String Source;
}