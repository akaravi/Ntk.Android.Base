package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilterDataModel {

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

    @SerializedName("IntValue")
    public Long IntValue = null;

    @SerializedName("IntContainValues")
    public List<Long> IntContainValues;

    @SerializedName("DateTimeValue")
    public String DateTimeValue;


    @SerializedName("BooleanValue")
    public Boolean BooleanValue = null;

    @SerializedName("EnumValue")
    public String EnumValue;

    @SerializedName("ObjectIdValue")
    public String ObjectIdValue;

    @SerializedName("SingleValue")
    public Float SingleValue = null;

    @SerializedName("DecimalValue")
    public Integer DecimalValue = null;

    @SerializedName("LatitudeValue")
    public Double LatitudeValue = null;

    @SerializedName("LongitudeValue")
    public Double LongitudeValue = null;

    @SerializedName("LatitudeLongitudeDistanceValue")
    public Double LatitudeLongitudeDistanceValue = null;

    @SerializedName("LatitudeLongitudeSortType")
    public String LatitudeLongitudeSortType;

    @SerializedName("HierarchyIdLevel")
    public Long HierarchyIdLevel;

    @SerializedName("ObjectIdContainValues")
    public List<String> ObjectIdContainValues;

    @SerializedName("ObjectIdValue1")
    public String ObjectIdValue1;

    public FilterDataModel setStringForceNullSearch(Boolean stringForceNullSearch) {
        StringForceNullSearch = stringForceNullSearch;
        return this;
    }

    public FilterDataModel setDecimalForceNullSearch(Boolean decimalForceNullSearch) {
        DecimalForceNullSearch = decimalForceNullSearch;
        return this;
    }

    public FilterDataModel setLatitudeLongitudeForceNullSearch(Boolean latitudeLongitudeForceNullSearch) {
        LatitudeLongitudeForceNullSearch = latitudeLongitudeForceNullSearch;
        return this;
    }

    public FilterDataModel setIntValueForceNullSearch(Boolean intValueForceNullSearch) {
        IntValueForceNullSearch = intValueForceNullSearch;
        return this;
    }

    public FilterDataModel setPropertyName(String propertyName) {
        PropertyName = propertyName;
        return this;
    }

    public FilterDataModel setPropertyAnyName(String propertyAnyName) {
        PropertyAnyName = propertyAnyName;
        return this;
    }

    public FilterDataModel setClauseType(int clauseType) {
        ClauseType = clauseType;
        return this;
    }

    public FilterDataModel setSearchType(int searchType) {
        SearchType = searchType;
        return this;
    }

    public FilterDataModel setStringValue(String stringValue) {
        StringValue = stringValue;
        return this;
    }

    public FilterDataModel setStringContainValues(List<String> stringContainValues) {
        StringContainValues = stringContainValues;
        return this;
    }

    public FilterDataModel setIntValue(Long intValue) {
        IntValue = intValue;
        return this;
    }


    public FilterDataModel setIntContainValues(List<Long> intContainValues) {
        IntContainValues = intContainValues;
        return this;
    }

    public FilterDataModel setDateTimeValue(String dateTimeValue) {
        DateTimeValue = dateTimeValue;
        return this;
    }


    public FilterDataModel setBooleanValue(Boolean booleanValue) {
        BooleanValue = booleanValue;
        return this;
    }

    public FilterDataModel setEnumValue(String enumValue) {
        EnumValue = enumValue;
        return this;
    }

    public FilterDataModel setObjectIdValue(String objectIdValue) {
        ObjectIdValue = objectIdValue;
        return this;
    }

    public FilterDataModel setSingleValue(Float singleValue) {
        SingleValue = singleValue;
        return this;
    }

    public FilterDataModel setLatitudeValue(Double latitudeValue) {
        LatitudeValue = latitudeValue;
        return this;
    }

    public FilterDataModel setLongitudeValue(Double longitudeValue) {
        LongitudeValue = longitudeValue;
        return this;
    }

    public FilterDataModel setLatitudeLongitudeSortType(String latitudeLongitudeSortType) {
        LatitudeLongitudeSortType = latitudeLongitudeSortType;
        return this;
    }

    ;
}
