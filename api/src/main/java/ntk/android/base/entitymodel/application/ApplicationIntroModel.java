package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

class ApplicationIntroModel extends BaseModuleEntity<Long> {
    @SerializedName("title")
    public String title;
    @SerializedName("description")
    public String description;
    @SerializedName("priority")
    public int priority;
    @SerializedName("linkMainImageId")
    public long linkMainImageId;
    @SerializedName("linkApplicationId")
    public long linkApplicationId;
    @SerializedName("application")
    public ApplicationAppModel application;
    @SerializedName("mainImageSrc")
    public String mainImageSrc;
}
