package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingTemplateModel extends BaseModuleEntity<Long> {
    public @SerializedName("title")
    String title;
    public @SerializedName("htmlBody")
    String htmlBody;
    public @SerializedName("linkTicketingDepartemenId")
    long linkTicketingDepartemenId;
}
