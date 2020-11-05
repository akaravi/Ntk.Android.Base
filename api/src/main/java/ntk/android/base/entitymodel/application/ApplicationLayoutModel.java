package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

class ApplicationLayoutModel extends BaseModuleEntity<Long> {
    @SerializedName("title")
    public String title;
    @SerializedName("linkMainImageId")
    public long linkMainImageId;
    @SerializedName("className")
    public String className;
    @SerializedName("linkSourceId")
    public long linkSourceId;
    @SerializedName("virtual_Source")
    public ApplicationSourceModel virtual_Source;
    @SerializedName("source")
    public ApplicationSourceModel source;
    @SerializedName("jsonFormDefaultValue")
    public String jsonFormDefaultValue;
    @SerializedName("jsonFormAdminSystemValue")
    public String jsonFormAdminSystemValue;
    @SerializedName("linkModuleFilePreviewImageId")
    public long linkModuleFilePreviewImageId;
    @SerializedName("layoutValues")
    public List<ApplicationLayoutValueModel> layoutValues;

}
