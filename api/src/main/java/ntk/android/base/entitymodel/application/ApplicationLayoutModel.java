package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

class ApplicationLayoutModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("LinkMainImageId")
    public long LinkMainImageId;
    @SerializedName("ClassName")
    public String ClassName;
    @SerializedName("LinkSourceId")
    public long LinkSourceId;
    @SerializedName("Virtual_Source")
    public ApplicationSourceModel Virtual_Source;
    @SerializedName("Source")
    public ApplicationSourceModel Source;
    @SerializedName("JsonFormDefaultValue")
    public String JsonFormDefaultValue;
    @SerializedName("JsonFormAdminSystemValue")
    public String JsonFormAdminSystemValue;
    @SerializedName("LinkModuleFilePreviewImageId")
    public long LinkModuleFilePreviewImageId;
    @SerializedName("LayoutValues")
    public List<ApplicationLayoutValueModel> LayoutValues;

}
