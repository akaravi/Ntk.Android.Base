package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.feildinfo.DataFieldInfoModel;

class AccessModel {
    @SerializedName("AccessDeleteRow")
    boolean AccessDeleteRow = false;
    @SerializedName("AccessWatchRow")
    boolean AccessWatchRow = false;
    @SerializedName("AccessEditRow")
    boolean AccessEditRow = false;
    @SerializedName("AccessAddRow")
    boolean AccessAddRow = false;
    @SerializedName("AccessRowInPanelDemo")
    boolean AccessRowInPanelDemo = false;
    @SerializedName("AccessRowWatchInSharingCategory")
    boolean AccessRowWatchInSharingCategory = false;
    @SerializedName("AccessWatchRowOtherSiteId")
    boolean AccessWatchRowOtherSiteId = false;
    @SerializedName("AccessWatchRowOtherCreatedBy")
    boolean AccessWatchRowOtherCreatedBy = false;
    @SerializedName("AccessEditRowOtherSiteId")
    boolean AccessEditRowOtherSiteId = false;
    @SerializedName("AccessEditRowOtherCreatedBy")
    boolean AccessEditRowOtherCreatedBy = false;
    @SerializedName("AccessDeleteRowOtherCreatedBy")
    boolean AccessDeleteRowOtherCreatedBy = false;

    @SerializedName("FieldsInfo")
    List<DataFieldInfoModel> FieldsInfo;
}
