package ntk.android.base.entitymodel.article;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class ArticleContentOtherInfoModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("HtmlBody")
    public String HtmlBody;
    @SerializedName("Source")
    public String Source;
    @SerializedName("LinkContentid")
    public long LinkContentid;
    @SerializedName("TypeId")
    public Integer TypeId;
    // tslint:disable-next-line: variable-name
    @SerializedName(" virtual_Content")
    public ArticleContentModel  virtual_Content;
    @SerializedName("Content")
    public ArticleContentModel Content;
}
