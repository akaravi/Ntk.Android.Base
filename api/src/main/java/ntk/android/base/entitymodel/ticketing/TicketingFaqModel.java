package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingFaqModel extends BaseModuleEntity<Long> {
    @SerializedName("Question")
    public String Question;
    @SerializedName("Answer")
    public String Answer;
    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;
    @SerializedName("virtual_TicketingDepartemen")
    public TicketingDepartemenModel virtual_TicketingDepartemen;
    @SerializedName("TicketingDepartemen")
    public TicketingDepartemenModel TicketingDepartemen;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
}
