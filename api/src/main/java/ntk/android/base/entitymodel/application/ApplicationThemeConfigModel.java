package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ThemeConfigLayoutModelPrev;
import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ApplicationThemeConfigModel extends BaseModuleEntity<Long> {

    @SerializedName("Title")
    public String Title;
    @SerializedName("TypeId")
    public String TypeId;
    @SerializedName("LinkMainImageId")
    public Long LinkMainImageId;
    @SerializedName("LinkSourceId")
    public Long LinkSourceId;
    @SerializedName(" virtual_Source")
    public ApplicationSourceModel  virtual_Source;
    @SerializedName("source")
    public ApplicationSourceModel Source;
    @SerializedName("ThemeConfigBuilderJsonValues")
    public String ThemeConfigBuilderJsonValues;
    @SerializedName("ThemeConfigRuntimeJsonValues")
    public String ThemeConfigRuntimeJsonValues;
    @SerializedName("ThemeConfigLayoutJsonValues")
    public String ThemeConfigLayoutJsonValues;
    @SerializedName("ThemeConfigJsonValues")
    public String ThemeConfigJsonValues;
    @SerializedName("ThemeConfigLayouts")
    public List<ThemeConfigLayoutModelPrev> ThemeConfigLayouts;
    @SerializedName("Applications")
    public List<ApplicationAppModel> Applications;

}
