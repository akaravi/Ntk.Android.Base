package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ArticleContentTagModel extends BaseModuleEntity<Long> {
    @SerializedName("linkContentid")
    public String linkContentid;
    @SerializedName("linkTagid")
    public long linkTagid;
    @SerializedName("virtual_ModuleContent")
    public ArticleContentModel virtual_ModuleContent;
    @SerializedName("moduleContent")
    public ArticleContentModel moduleContent;

}
