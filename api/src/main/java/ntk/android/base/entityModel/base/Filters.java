package ntk.android.base.entitymodel.base;

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

    @SerializedName("StringValue")
    public String StringValue;

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
    public String DateTimeValue2;

    @SerializedName("BooleanValue")
    public Boolean BooleanValue = null;

    @SerializedName("EnumValue")
    public String EnumValue1;

    @SerializedName("ObjectIdValue")
    public String ObjectIdValue;

    @SerializedName("SingleValue1")
    public Float SingleValue1 = null;

    @SerializedName("SingleValue2")
    public Float SingleValue2 = null;

    @SerializedName("DecimalValue1")
    public Integer DecimalValue1 = null;

    @SerializedName("DecimalValue2")
    public Integer DecimalValue2 = null;

    @SerializedName("LatitudeValue")
    public Double LatitudeValue = null;

    @SerializedName("LongitudeValue")
    public Double LongitudeValue = null;

    @SerializedName("LatitudeLongitudeDistanceValue1")
    public Double LatitudeLongitudeDistanceValue1 = null;

    @SerializedName("LatitudeLongitudeDistanceValue2")
    public Double LatitudeLongitudeDistanceValue2 = null;

    @SerializedName("LatitudeLongitudeSortType")
    public String LatitudeLongitudeSortType;

    public Filters setStringForceNullSearch(Boolean stringForceNullSearch) {
        StringForceNullSearch = stringForceNullSearch;
        return this;
    }

    public Filters setDecimalForceNullSearch(Boolean decimalForceNullSearch) {
        DecimalForceNullSearch = decimalForceNullSearch;
        return this;
    }

    public Filters setLatitudeLongitudeForceNullSearch(Boolean latitudeLongitudeForceNullSearch) {
        LatitudeLongitudeForceNullSearch = latitudeLongitudeForceNullSearch;
        return this;
    }

    public Filters setIntValueForceNullSearch(Boolean intValueForceNullSearch) {
        IntValueForceNullSearch = intValueForceNullSearch;
        return this;
    }

    public Filters setPropertyName(String propertyName) {
        PropertyName = propertyName;
        return this;
    }

    public Filters setPropertyAnyName(String propertyAnyName) {
        PropertyAnyName = propertyAnyName;
        return this;
    }

    public Filters setClauseType(int clauseType) {
        ClauseType = clauseType;
        return this;
    }

    public Filters setSearchType(int searchType) {
        SearchType = searchType;
        return this;
    }

    public Filters setStringValue(String stringValue) {
        StringValue = stringValue;
        return this;
    }

    public Filters setStringContainValues(List<String> stringContainValues) {
        StringContainValues = stringContainValues;
        return this;
    }

    public Filters setIntValue1(Long intValue1) {
        IntValue1 = intValue1;
        return this;
    }

    public Filters setIntValue2(Long intValue2) {
        IntValue2 = intValue2;
        return this;
    }

    public Filters setIntContainValues(List<Long> intContainValues) {
        IntContainValues = intContainValues;
        return this;
    }

    public Filters setDateTimeValue1(String dateTimeValue1) {
        DateTimeValue1 = dateTimeValue1;
        return this;
    }

    public Filters setDateTimeValue2(String dateTimeValue2) {
        DateTimeValue2 = dateTimeValue2;
        return this;
    }

    public Filters setBooleanValue(Boolean booleanValue) {
        BooleanValue = booleanValue;
        return this;
    }

    public Filters setEnumValue1(String enumValue1) {
        EnumValue1 = enumValue1;
        return this;
    }

    public Filters setObjectIdValue(String objectIdValue) {
        ObjectIdValue = objectIdValue;
        return this;
    }

    public Filters setSingleValue1(Float singleValue1) {
        SingleValue1 = singleValue1;
        return this;
    }

    public Filters setSingleValue2(Float singleValue2) {
        SingleValue2 = singleValue2;
        return this;
    }

    public Filters setDecimalValue1(Integer decimalValue1) {
        DecimalValue1 = decimalValue1;
        return this;
    }

    public Filters setDecimalValue2(Integer decimalValue2) {
        DecimalValue2 = decimalValue2;
        return this;
    }

    public Filters setLatitudeValue(Double latitudeValue) {
        LatitudeValue = latitudeValue;
        return this;
    }

    public Filters setLongitudeValue(Double longitudeValue) {
        LongitudeValue = longitudeValue;
        return this;
    }

    public Filters setLatitudeLongitudeDistanceValue1(Double latitudeLongitudeDistanceValue1) {
        LatitudeLongitudeDistanceValue1 = latitudeLongitudeDistanceValue1;
        return this;
    }

    public Filters setLatitudeLongitudeDistanceValue2(Double latitudeLongitudeDistanceValue2) {
        LatitudeLongitudeDistanceValue2 = latitudeLongitudeDistanceValue2;
        return this;
    }

    public Filters setLatitudeLongitudeSortType(String latitudeLongitudeSortType) {
        LatitudeLongitudeSortType = latitudeLongitudeSortType;
        return this;
    }

    ;
}
