package ntk.base.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Filters {

    @SerializedName("StringForceNullSearch")
    public Boolean StringForceNullSearch = null;

    @SerializedName("DecimalForceNullSearch")
    public Boolean DecimalForceNullSearch = null;

    @SerializedName("LatitudeLongitudeForceNullSearch")
    public Boolean LatitudeLongitudeForceNullSearch = null;

    @SerializedName("IntValueForceNullSearch")
    public Boolean IntValueForceNullSearch = null;

    @SerializedName("PropertyName")
    public String PropertyName;

    @SerializedName("PropertyAnyName")
    public String PropertyAnyName;

    @SerializedName("ClauseType")
    public int ClauseType;

    @SerializedName("SearchType")
    public int SearchType;

    @SerializedName("StringValue1")
    public String StringValue1;

    @SerializedName("StringContainValues")
    public List<String> StringContainValues;

    @SerializedName("IntValue1")
    public Long IntValue1 = null;

    @SerializedName("IntValue2")
    public Long IntValue2 = null;

    @SerializedName("IntContainValues")
    public List<Long> IntContainValues;

    @SerializedName("DateTimeValue1")
    public String DateTimeValue1;

    @SerializedName("DateTimeValue2")
    public String  DateTimeValue2;

    @SerializedName("BooleanValue1")
    public Boolean BooleanValue1 = null;

    @SerializedName("EnumValue1")
    public String EnumValue1;

    @SerializedName("SingleValue1")
    public Float SingleValue1 = null;

    @SerializedName("SingleValue2")
    public Float SingleValue2 = null;

    @SerializedName("DecimalValue1")
    public Integer DecimalValue1 = null;

    @SerializedName("DecimalValue2")
    public Integer DecimalValue2 = null;

    @SerializedName("LatitudeValue1")
    public Double LatitudeValue1 = null;

    @SerializedName("LongitudeValue1")
    public Double LongitudeValue1 = null;

    @SerializedName("LatitudeLongitudeDistanceValue1")
    public Double LatitudeLongitudeDistanceValue1 = null;

    @SerializedName("LatitudeLongitudeDistanceValue2")
    public Double LatitudeLongitudeDistanceValue2 = null;

    @SerializedName("LatitudeLongitudeSortType")
    public String LatitudeLongitudeSortType;
}
