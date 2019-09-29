package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.base.api.baseModel.FilterModel;

public class BiographyContentListRequest extends FilterModel {

    @SerializedName("TagIds")
    public List<Long> TagIds;


}
