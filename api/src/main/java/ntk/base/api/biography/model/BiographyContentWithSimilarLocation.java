package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.BaseEntity;

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