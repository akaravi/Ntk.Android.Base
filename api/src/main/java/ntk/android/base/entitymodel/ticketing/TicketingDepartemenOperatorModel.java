package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingDepartemenOperatorModel extends BaseModuleEntity<Long> {
    @SerializedName("linkDepartemenId")
    public long linkDepartemenId;
    @SerializedName("linkUserId")
    public long linkUserId;
    @SerializedName("virtual_Departemen")
    public TicketingDepartemenModel virtual_Departemen;
    @SerializedName("departemen")
    public TicketingDepartemenModel departemen;
    @SerializedName("answers")
    public List<TicketingAnswerModel> answers;
}
