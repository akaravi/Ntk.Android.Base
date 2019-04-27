package ntk.base.api.file.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class FileContentRequest extends FilterModel {

    @SerializedName("TagId")
    public long TagId;

    @SerializedName("Id")
    public long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;

    @SerializedName("ScorePercent")
    public int ScorePercent;
}
