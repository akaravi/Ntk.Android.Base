package ntk.android.base.dtomodel.biography;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BiographyContentWithSimilarLocationPeriodDtoModel {
    @SerializedName("TagIds")
    public List<Long> TagIds;
    @SerializedName("LocationId")
    public Long LocationId;
}
