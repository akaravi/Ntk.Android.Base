package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BlogContentTagModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkContentid")
    public String LinkContentid;
    @SerializedName("LinkTagid")
    public long LinkTagid;
    @SerializedName(" virtual_ModuleContent")
    public BlogContentModel  virtual_ModuleContent;
    @SerializedName("ModuleContent")
    public BlogContentModel ModuleContent;

}
