package ntk.android.base.api.baseModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultAccessModelPrev {
    @SerializedName("AccessDeleteRow")
    public boolean AccessDeleteRow;

    @SerializedName("AccessWatchRow")
    public boolean AccessWatchRow;

    @SerializedName("AccessEditRow")
    public boolean AccessEditRow;

    @SerializedName("AccessAddRow")
    public boolean AccessAddRow;

    @SerializedName("AccessRowInPanelDemo")
    public boolean AccessRowInPanelDemo;

    @SerializedName("AccessRowWatchInSharingCategory")
    public boolean AccessRowWatchInSharingCategory;

    @SerializedName("AccessWatchRowOtherSiteId")
    public boolean AccessWatchRowOtherSiteId;

    @SerializedName("AccessWatchRowOtherCreatedBy")
    public boolean AccessWatchRowOtherCreatedBy;

    @SerializedName("AccessEditRowOtherSiteId")
    public boolean AccessEditRowOtherSiteId;

    @SerializedName("AccessEditRowOtherCreatedBy")
    public boolean AccessEditRowOtherCreatedBy;

    @SerializedName("AccessDeleteRowOtherCreatedBy")
    public boolean AccessDeleteRowOtherCreatedBy;

    @SerializedName("FieldsInfo")
    public List<FieldInfoModelPrev> FieldsInfo;

}
