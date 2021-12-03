package ntk.android.base.entitymodel.biography;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BiographyContentTagModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkContentId")
    public long LinkContentId;
    @SerializedName("LinkTagId")
    public long LinkTagId;
    @SerializedName("virtual_ModuleContent")
    public Object virtual_ModuleContent;
    @SerializedName("ModuleContent")
    public Object ModuleContent;
}
