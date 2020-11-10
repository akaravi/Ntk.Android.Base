package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreGuideModel extends BaseEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("bodyFa")
    public String bodyFa;
    @SerializedName("bodyEn")
    public String bodyEn;
    @SerializedName("bodyAr")
    public String bodyAr;
    @SerializedName("linkFileIds")
    public String linkFileIds;
    @SerializedName("linkParentId")
    public Long linkParentId;
    @SerializedName("virtual_Parent")
    public CoreGuideModel virtual_Parent;
    @SerializedName("parent")
    public CoreGuideModel parent;
    @SerializedName("children")
    public List<CoreGuideModel> children;
}

