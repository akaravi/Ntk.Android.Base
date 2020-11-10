package ntk.android.base.entitymodel.news;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class NewsContentTagModel extends BaseModuleEntity<Long> {
    @SerializedName("linkContentid")
    public String linkContentid;
    @SerializedName("linkTagid")
    public long linkTagid;
    @SerializedName("virtual_ModuleContent")
    public NewsContentModel virtual_ModuleContent;
    @SerializedName("moduleContent")
    public NewsContentModel moduleContent;

}
