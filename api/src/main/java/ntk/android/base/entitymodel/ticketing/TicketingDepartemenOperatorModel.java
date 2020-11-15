package ntk.android.base.entitymodel.ticketing;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class TicketingDepartemenOperatorModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkDepartemenId")
    public long LinkDepartemenId;
    @SerializedName("LinkUserId")
    public long LinkUserId;
    @SerializedName(" virtual_Departemen")
    public TicketingDepartemenModel  virtual_Departemen;
    @SerializedName("Departemen")
    public TicketingDepartemenModel Departemen;
    @SerializedName("Answers")
    public List<TicketingAnswerModel> Answers;
}
