package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingTemplateModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public  String Title;
    @SerializedName("HtmlBody")
    public  String HtmlBody;
    @SerializedName("LinkTicketingDepartemenId")
    public long LinkTicketingDepartemenId;
}
