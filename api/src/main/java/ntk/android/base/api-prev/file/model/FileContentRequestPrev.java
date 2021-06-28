package ntk.android.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.FilterModelPrev;

public class FileContentRequestPrev extends FilterModelPrev {

    @SerializedName("TagId")
    public long TagId;

    @SerializedName("Id")
    public long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}
