package ntk.android.base.dtomodel.biography;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearDtoModel {
    @SerializedName("TagIds")
    public List<Long> TagIds;
    @SerializedName("MonthOfYear")
    public long MonthOfYear;
    @SerializedName("DayOfMonth")
    public long DayOfMonth;
}