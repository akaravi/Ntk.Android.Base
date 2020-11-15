package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FilterDataModel {

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
    public List<Filters> Filters;



    public FilterDataModel addFilter(Filters f) {
        if (Filters == null)
            Filters = new ArrayList<>();
        Filters.add(f);
        return this;
    }
}
