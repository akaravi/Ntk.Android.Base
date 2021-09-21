package ntk.android.base.entitymodel.estate;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class EstatePropertyDetailGroupModel extends BaseModuleEntity<String> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("IconFont")
    public String IconFont;
    @SerializedName("IconColor")
    public String IconColor;
    @SerializedName("ShowInFormOrder")
    public Integer ShowInFormOrder;
    @SerializedName("IsHistoryable")
    public boolean IsHistoryable;
    @SerializedName("IsSearchable")
    public boolean IsSearchable;
    @SerializedName("LinkPropertyTypeLanduseId")
    public String LinkPropertyTypeLanduseId;
    @SerializedName("PropertyDetails")
    List<EstatePropertyDetailModel> PropertyDetails;
}
