package ntk.android.base.dtomodel.biography;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BiographyContentWithSimilarDatePeriodStartDtoModel {
    @SerializedName("TagIds")
    public List<Long> TagIds;
    @SerializedName("SearchDayMin")
    public Long SearchDayMin;
    @SerializedName("SearchDayMax")
    public Long SearchDayMax;
}
