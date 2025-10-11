package ntk.android.base.dtomodel.biography;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BiographyContentWithSimilarDatePeriodStartDayOfYearDtoModel {
    @SerializedName("TagIds")
    public List<Long> TagIds;
    @SerializedName("DayOfYearMin")
    public Long DayOfYearMin;
    @SerializedName("DayOfYearMax")
    public Long DayOfYearMax;
}
