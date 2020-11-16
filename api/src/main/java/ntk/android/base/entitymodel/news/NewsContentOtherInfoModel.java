package ntk.android.base.entitymodel.news;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.news.entity.NewsContent;
import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class NewsContentOtherInfoModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("HtmlBody")
    public String HtmlBody;
    @SerializedName("Source")
    public String Source;
    @SerializedName("LinkContentid")
    public long linkContentid;
    @SerializedName("TypeId")
    public Integer TypeId;
    // tslint:disable-next-line: variable-name
    @SerializedName(" virtual_Content")
    public NewsContentModel virtual_Content;
    @SerializedName("Content")
    public NewsContentModel Content;
}
