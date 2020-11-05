package ntk.android.base.api.ticket.entity;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.baseModel.BaseEntity;

public class TicketingFaq extends BaseEntity {

    @SerializedName("Id")
    public Long Id;


    @SerializedName("Question")
    public String Question;

    @SerializedName("Answer")
    public String Answer;

    @SerializedName("LinkTicketingDepartemenId")
    public Long LinkTicketingDepartemenId;


    @SerializedName("Departemen")
    public TicketingDepartemen Departemen;

    @SerializedName("virtual_Departemen")
    public TicketingDepartemen virtual_Departemen;
}