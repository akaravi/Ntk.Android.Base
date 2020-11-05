package ntk.android.base.entitymodel.application;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.api.baseModel.ThemeConfigLayoutModel;
import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ApplicationThemeConfigModel extends BaseModuleEntity<Long> {

    @SerializedName("title")
    public String title;
    @SerializedName("typeId")
    public String typeId;
    @SerializedName("linkMainImageId")
    public Long linkMainImageId;
    @SerializedName("linkSourceId")
    public Long linkSourceId;
    @SerializedName("virtual_Source")
    public ApplicationSourceModel virtual_Source;
    @SerializedName("source")
    public ApplicationSourceModel source;
    @SerializedName("themeConfigBuilderJsonValues")
    public String themeConfigBuilderJsonValues;
    @SerializedName("themeConfigRuntimeJsonValues")
    public String themeConfigRuntimeJsonValues;
    @SerializedName("themeConfigLayoutJsonValues")
    public String themeConfigLayoutJsonValues;
    @SerializedName("themeConfigJsonValues")
    public String themeConfigJsonValues;
    @SerializedName("themeConfigLayouts")
    public List<ThemeConfigLayoutModel> themeConfigLayouts;
    @SerializedName("applications")
    public List<ApplicationAppModel> applications;

}
