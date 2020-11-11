package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.blog.entity.BlogContent;
import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BlogContentOtherInfoModel extends BaseModuleEntity<Long> {
    @SerializedName("title")
    public String title;
    @SerializedName("htmlBody")
    public String htmlBody;
    @SerializedName("source")
    public String source;
    @SerializedName("linkContentid")
    public long linkContentid;
    @SerializedName("typeId")
    public Integer typeId;
    // tslint:disable-next-line: variable-name
    @SerializedName("virtual_Content")
    public BlogContentModel virtual_Content;
    @SerializedName("Content")
    public BlogContent Content;
}
