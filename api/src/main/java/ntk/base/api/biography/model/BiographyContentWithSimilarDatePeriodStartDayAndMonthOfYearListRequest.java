package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.FilterModel;

public class BiographyContentWithSimilarDatePeriodStartDayAndMonthOfYearListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;

    @SerializedName("MountOfYear")
    public int MountOfYear;

    @SerializedName("DayOfMonth")
    public int DayOfMonth;
}
