package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingTemplateModel extends BaseModuleEntity<Long> {
    public @SerializedName("Title")
    String Title;
    public @SerializedName("HtmlBody")
    String HtmlBody;
    public @SerializedName("LinkTicketingDepartemenId")
    long LinkTicketingDepartemenId;
}
