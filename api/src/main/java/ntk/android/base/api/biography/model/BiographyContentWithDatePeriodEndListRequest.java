package ntk.android.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.FilterModel;

public class BiographyContentWithDatePeriodEndListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;

    @SerializedName("SearchDateMin")
    public String SearchDateMin;

    @SerializedName("SearchDateMax")
    public String SearchDateMax;
}
