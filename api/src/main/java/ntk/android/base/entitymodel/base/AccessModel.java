package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.feildinfo.DataFieldInfoModel;

class AccessModel {
    @SerializedName("AccessDeleteRow")
    public boolean AccessDeleteRow = false;
    @SerializedName("AccessWatchRow")
    public boolean AccessWatchRow = false;
    @SerializedName("AccessEditRow")
    public boolean AccessEditRow = false;
    @SerializedName("AccessAddRow")
    public boolean AccessAddRow = false;
    @SerializedName("AccessRowInPanelDemo")
    public boolean AccessRowInPanelDemo = false;
    @SerializedName("AccessRowWatchInSharingCategory")
    public boolean AccessRowWatchInSharingCategory = false;
    @SerializedName("AccessWatchRowOtherSiteId")
    public boolean AccessWatchRowOtherSiteId = false;
    @SerializedName("AccessWatchRowOtherCreatedBy")
    public boolean AccessWatchRowOtherCreatedBy = false;
    @SerializedName("AccessEditRowOtherSiteId")
    public boolean AccessEditRowOtherSiteId = false;
    @SerializedName("AccessEditRowOtherCreatedBy")
    public boolean AccessEditRowOtherCreatedBy = false;
    @SerializedName("AccessDeleteRowOtherCreatedBy")
    public boolean AccessDeleteRowOtherCreatedBy = false;

    @SerializedName("FieldsInfo")
    public List<DataFieldInfoModel> FieldsInfo;
}
