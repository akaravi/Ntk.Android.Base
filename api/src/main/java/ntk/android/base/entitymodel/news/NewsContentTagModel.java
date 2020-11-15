package ntk.android.base.entitymodel.news;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class NewsContentTagModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkContentid")
    public String LinkContentid;
    @SerializedName("LinkTagid")
    public long LinkTagid;
    @SerializedName(" virtual_ModuleContent")
    public NewsContentModel  virtual_ModuleContent;
    @SerializedName("ModuleContent")
    public NewsContentModel ModuleContent;

}
