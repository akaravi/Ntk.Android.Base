package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.FilterModel;

public class BiographyContentWithSimilarDatePeriodEndListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;

    @SerializedName("SearchDayMin")
    public int SearchDayMin;

    @SerializedName("SearchDayMax")
    public int SearchDayMax;
}
