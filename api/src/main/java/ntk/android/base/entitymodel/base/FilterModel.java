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
}
