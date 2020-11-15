package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ArticleContentTagModel extends BaseModuleEntity<Long> {
    @SerializedName("LinkContentid")
    public String LinkContentid;
    @SerializedName("LinkTagid")
    public long LinkTagid;
    @SerializedName(" virtual_ModuleContent")
    public ArticleContentModel  virtual_ModuleContent;
    @SerializedName("ModuleContent")
    public ArticleContentModel ModuleContent;

}
