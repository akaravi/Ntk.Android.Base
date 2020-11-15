package ntk.android.base.entitymodel.blog;

import com.google.gson.annotations.SerializedName;

import ntk.android.base.api.blog.entity.BlogContent;
import ntk.android.base.entitymodel.base.BaseModuleEntity;

public class BlogContentOtherInfoModel extends BaseModuleEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("HtmlBody")
    public String HtmlBody;
    @SerializedName("Source")
    public String Source;
    @SerializedName("LinkContentid")
    public long LinkContentid;
    @SerializedName("TypeId")
    public Integer typeId;
    // tslint:disable-next-line: variable-name
    @SerializedName("Virtual_Content")
    public BlogContentModel Virtual_Content;
    @SerializedName("Content")
    public BlogContent Content;
}
