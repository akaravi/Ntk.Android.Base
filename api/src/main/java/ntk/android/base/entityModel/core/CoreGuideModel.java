package ntk.android.base.entitymodel.core;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ntk.android.base.entitymodel.base.BaseEntity;

public class CoreGuideModel extends BaseEntity<Long> {
    @SerializedName("Title")
    public String Title;
    @SerializedName("BodyFa")
    public String BodyFa;
    @SerializedName("BodyEn")
    public String BodyEn;
    @SerializedName("BodyAr")
    public String BodyAr;
    @SerializedName("LinkFileIds")
    public String LinkFileIds;
    @SerializedName("LinkParentId")
    public Long LinkParentId;
    @SerializedName("Virtual_Parent")
    public CoreGuideModel Virtual_Parent;
    @SerializedName("Parent")
    public CoreGuideModel Parent;
    @SerializedName("Children")
    public List<CoreGuideModel> Children;
}

