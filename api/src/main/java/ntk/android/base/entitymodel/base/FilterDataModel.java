package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import ntk.android.base.entitymodel.enums.EnumClauseType;
import ntk.android.base.entitymodel.enums.EnumSearchType;

public class FilterDataModel {
    @SerializedName("PropertyName")
    public String PropertyName;
    @SerializedName("ClauseType")//as EnumClauseType
    public int ClauseType;
    @SerializedName("PropertyAnyName")
    public String PropertyAnyName;
    @SerializedName("SearchType")
    public int SearchType;
    @SerializedName("Filters")
    List<FilterDataModel> Filters;
    @SerializedName("Value")
    Object Value;
    List<Object> Values;
//    @SerializedName("StringForceNullSearch")
//    public Boolean StringForceNullSearch = null;

    //    @SerializedName("DecimalForceNullSearch")
//    public Boolean DecimalForceNullSearch = null;
//
//    @SerializedName("LatitudeLongitudeForceNullSearch")
//    public Boolean LatitudeLongitudeForceNullSearch = null;
//
//    @SerializedName("IntValueForceNullSearch")
//    public Boolean IntValueForceNullSearch = null;
//
//    @SerializedName("StringValue")
//    public String StringValue;
//
//    @SerializedName("StringContainValues")
//    public List<String> StringContainValues;
//
//    @SerializedName("IntValue")
//    public Long IntValue = null;
//
//    @SerializedName("IntContainValues")
//    public List<Long> IntContainValues;
//
//    @SerializedName("DateTimeValue")
//    public String DateTimeValue;
//
//    @SerializedName("BooleanValue")
//    public Boolean BooleanValue = null;
//
//    @SerializedName("EnumValue")
//    public String EnumValue;
//
//    @SerializedName("ObjectIdValue")
//    public String ObjectIdValue;
//
//    @SerializedName("SingleValue")
//    public Float SingleValue = null;
//
//    @SerializedName("DecimalValue")
//    public Integer DecimalValue = null;
//
    @SerializedName("LatitudeValue")
    public Double LatitudeValue = null;

    @SerializedName("LongitudeValue")
    public Double LongitudeValue = null;

    @SerializedName("LatitudeLongitudeDistanceValue")
    public Double LatitudeLongitudeDistanceValue = null;

//    @SerializedName("LatitudeLongitudeSortType")
//    public String LatitudeLongitudeSortType;
//
//    @SerializedName("HierarchyIdLevel")
//    public Long HierarchyIdLevel;
//
//    @SerializedName("ObjectIdContainValues")
//    public List<String> ObjectIdContainValues;
//
//    @SerializedName("ObjectIdValue1")
//    public String ObjectIdValue1;
//
//    public FilterDataModel setStringForceNullSearch(Boolean stringForceNullSearch) {
//        StringForceNullSearch = stringForceNullSearch;
//        return this;
//    }

    public FilterDataModel setDecimalForceNullSearch(Boolean decimalForceNullSearch) {
        Value = decimalForceNullSearch;
        return this;
    }

    public FilterDataModel setLatitudeLongitudeForceNullSearch(Boolean latitudeLongitudeForceNullSearch) {
        Value = latitudeLongitudeForceNullSearch;
        return this;
    }

    public FilterDataModel setIntValueForceNullSearch(Boolean intValueForceNullSearch) {
        Value = intValueForceNullSearch;
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

    public FilterDataModel setClauseType(EnumClauseType clauseType) {
        ClauseType = clauseType.index();
        return this;
    }

    public FilterDataModel setSearchType(int searchType) {
        SearchType = searchType;
        return this;
    }

    public FilterDataModel setSearchType(EnumSearchType searchType) {
        SearchType = searchType.index();
        return this;
    }

    public FilterDataModel setStringValue(String stringValue) {
        Value = stringValue;
        return this;
    }

    public FilterDataModel setStringContainValues(List<String> stringContainValues) {
        Value = stringContainValues;
        return this;
    }

    public FilterDataModel setIntValue(Long intValue) {
        Value = intValue;
        return this;
    }


    public FilterDataModel setIntContainValues(List<Long> intContainValues) {
        Value = intContainValues;
        return this;
    }

    public FilterDataModel setDateTimeValue(String dateTimeValue) {
        Value = dateTimeValue;
        return this;
    }


    public FilterDataModel setBooleanValue(Boolean booleanValue) {
        Value = booleanValue;
        return this;
    }

    public FilterDataModel setEnumValue(String enumValue) {
        Value = enumValue;
        return this;
    }

    public FilterDataModel setObjectIdValue(String objectIdValue) {
        Value = objectIdValue;
        return this;
    }

    public FilterDataModel setSingleValue(Float singleValue) {
        Value = singleValue;
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
        Value = latitudeLongitudeSortType;
        return this;
    }

    public FilterDataModel addInnerFilter(FilterDataModel d) {
        if (Filters == null)
            Filters = new ArrayList<>();
        Filters.add(d);
        return this;
    }
}
