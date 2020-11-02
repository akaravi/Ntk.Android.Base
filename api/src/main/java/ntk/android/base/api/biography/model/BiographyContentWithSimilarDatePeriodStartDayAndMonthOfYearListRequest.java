package ntk.android.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.FilterModel;

public class BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;

    @SerializedName("MonthOfYear")
    public int MonthOfYear;

    @SerializedName("DayOfMonth")
    public int DayOfMonth;
}
