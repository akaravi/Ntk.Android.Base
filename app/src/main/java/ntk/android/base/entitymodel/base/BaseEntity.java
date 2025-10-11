package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class BaseEntity<TKey> {
    @SerializedName("Id")
    public TKey Id;
    @SerializedName("CreatedDate")
    public Date CreatedDate;
    @SerializedName("CreatedBy")
    public long CreatedBy;
    @SerializedName("UpdatedDate")
    public Date UpdatedDate;
    @SerializedName("UpdatedBy")
    public long UpdatedBy;
    @SerializedName("RecordStatus")
    public int RecordStatus;
    @SerializedName("RecordStatusText")
    public String RecordStatusText;

    @SerializedName("AntiInjectionGuid")
    //region AntiInjection
    public String AntiInjectionGuid;
    @SerializedName("AntiInjectionDate")
    public Date AntiInjectionDate;
    @SerializedName("CreateAntiInjectionValue")
    public boolean CreateAntiInjectionValue;
    @SerializedName("AntiInjectionExpiredMinute")
    public int AntiInjectionExpiredMinute;
    @SerializedName("AntiInjectionToken")
    public String AntiInjectionToken;
    @SerializedName("AntiInjectionExpireDate")
    public Date AntiInjectionExpireDate;
    //endregion AniInjection
}
