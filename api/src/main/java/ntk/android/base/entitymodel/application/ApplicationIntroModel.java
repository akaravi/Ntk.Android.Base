package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ApplicationIntroModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;
    @SerializedName("Priority")
    public int Priority;
    @SerializedName("LinkMainImageId")
    public long LinkMainImageId;
    @SerializedName("LinkApplicationId")
    public long LinkApplicationId;
    @SerializedName("Application")
    public ApplicationAppModel Application;
    @SerializedName("MainImageSrc")
    public String MainImageSrc;
}
