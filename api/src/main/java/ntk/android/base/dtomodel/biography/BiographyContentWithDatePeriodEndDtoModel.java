package ntk.android.base.dtomodel.biography;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BiographyContentWithDatePeriodEndDtoModel {
    @SerializedName("TagIds")
    public List<Long> TagIds;
    @SerializedName("SearchDateMin")
    public String SearchDateMin;
    @SerializedName("SearchDateMax")
    public String SearchDateMax;
}
