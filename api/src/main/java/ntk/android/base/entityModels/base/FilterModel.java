package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FilterModel {

    @SerializedName("Count")
    public boolean Count;

    @SerializedName("TotalRowData")
    public int TotalRowData;

    @SerializedName("SkipRowData")
    public int SkipRowData;

    @SerializedName("CurrentPageNumber")
    public int CurrentPageNumber;

    @SerializedName("RowPerPage")
    public int RowPerPage;

    @SerializedName("SortType")
    public int SortType;

    @SerializedName("SortColumn")
    public String SortColumn;

    @SerializedName("Filters")
    public List<FilterDataModel> Filters;

    public FilterModel addFilter(FilterDataModel f) {
        if (Filters == null)
            Filters = new ArrayList<>();
        Filters.add(f);
        return this;
    }

    public FilterModel setCount(boolean count) {
        Count = count;
        return this;
    }

    public FilterModel setTotalRowData(int totalRowData) {
        TotalRowData = totalRowData;
        return this;
    }

    public FilterModel setSkipRowData(int skipRowData) {
        SkipRowData = skipRowData;
        return this;
    }

    public FilterModel setCurrentPageNumber(int currentPageNumber) {
        CurrentPageNumber = currentPageNumber;
        return this;
    }

    public FilterModel setRowPerPage(int rowPerPage) {
        RowPerPage = rowPerPage;
        return this;
    }

    public FilterModel setSortType(int sortType) {
        SortType = sortType;
        return this;
    }

    public FilterModel setSortColumn(String sortColumn) {
        SortColumn = sortColumn;
        return this;
    }
}
