package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.model.ErrorException;

public class BiographyCommentViewRequest{

    @SerializedName("Id")
    public Long Id;

    @SerializedName("ActionClientOrder")
    public int ActionClientOrder;
}
