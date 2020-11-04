package ntk.android.base.entitymodel.news;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.news.entity.NewsContent;
import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class NewsContentOtherInfoModel extends BaseModuleEntity<Long> {
    @SerializedName("title")
    public String title;
    @SerializedName("htmlBody")
    public String htmlBody;
    @SerializedName("source")
    public String source;
    @SerializedName("linkContentid")
    public long linkContentid;
    @SerializedName("typeId")
    public Long typeId;
    // tslint:disable-next-line: variable-name
    @SerializedName("virtual_Content")
    public NewsContentModel virtual_Content;
    @SerializedName("Content")
    public NewsContent Content;
}
