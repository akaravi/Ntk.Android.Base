package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BlogContentTagModel extends BaseModuleEntity<Long> {
    @SerializedName("linkContentid")
    public String linkContentid;
    @SerializedName("linkTagid")
    public long linkTagid;
    @SerializedName("virtual_ModuleContent")
    public BlogContentModel virtual_ModuleContent;
    @SerializedName("moduleContent")
    public BlogContentModel moduleContent;

}
