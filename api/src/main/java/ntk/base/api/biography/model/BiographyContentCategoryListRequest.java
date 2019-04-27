package ntk.base.api.biography.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.model.FilterModel;

public class BiographyContentCategoryListRequest extends FilterModel {

    @SerializedName("LinkContentId")
    public Long LinkContentId;
}
