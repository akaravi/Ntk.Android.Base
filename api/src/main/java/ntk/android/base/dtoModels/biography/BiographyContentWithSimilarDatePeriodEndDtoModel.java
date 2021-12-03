package ntk.android.base.dtomodel.biography;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BiographyContentWithSimilarDatePeriodEndDtoModel {
    @SerializedName("TagIds")
    public List<Long> TagIds;
    @SerializedName("SearchDayMin")
    public String SearchDayMin;
    @SerializedName("SearchDayMax")
    public String SearchDayMax;
}
