package ntk.base.api.ticket.entity;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.baseModel.BaseEntity;

public class TicketingDepartemenOprator extends BaseEntity {

    @SerializedName("Id")
    public long Id;

    @SerializedName("LinkDepartemenId")
    public long LinkDepartemenId;

    @SerializedName("LinkUserId")
    public long LinkUserId;

    @SerializedName("Departemen")
    public TicketingDepartemen Departemen;

    @SerializedName("virtual_Departemen")
    public TicketingDepartemen virtual_Departemen;

}
