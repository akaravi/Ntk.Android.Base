package ntk.android.base.api.baseModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilterModelPrev {

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
    public List<FiltersPrev> filters;
}
