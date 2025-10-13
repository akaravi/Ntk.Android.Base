package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

public class SearchTypeModel {
    public static int SORT_DESCENDING = 0;
    public static int SORT_ASCENDING = 1;
    public static int SORT_RANDOM = 2;
    public int SortType;

    public String SortColumn;
    public String DisplayName;

    public int getSortType() {
        return SortType;
    }

    public SearchTypeModel setSortType(int sortType) {
        SortType = sortType;
        return this;
    }

    public String getSortColumn() {
        return SortColumn;
    }

    public SearchTypeModel setSortColumn(String sortColumn) {
        SortColumn = sortColumn;
        return this;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public SearchTypeModel setDisplayName(String displayName) {
        DisplayName = displayName;
        return this;
    }
}
