package ntk.base.api.service.model;

import com.google.gson.annotations.SerializedName;

public class ServiceCommentViewRequest {

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;
}
