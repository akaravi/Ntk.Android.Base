package ntk.android.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.FilterModel;

public class BiographyContentWithSimilarDatePeriodStartDayOfYearListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;

    @SerializedName("DayOfYearMin")
    public int DayOfYearMin;

    @SerializedName("DayOfYearMax")
    public int DayOfYearMax;
}
