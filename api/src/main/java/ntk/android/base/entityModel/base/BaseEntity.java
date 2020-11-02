package ntk.android.base.entityModel.base;

import java.util.Date;

public class BaseEntity<TKey> {
    public TKey Id ;


    public Date CreatedDate;
    public long CreatedBy;
    public Date UpdatedDate;
    public long UpdatedBy;
    public int RecordStatus;

    public String RecordStatusText ;


    //region AntiInjection
    public String AntiInjectionGuid;
    public Date AntiInjectionDate;
    public boolean CreateAntiInjectionValue;
    public int AntiInjectionExpiredMinute;
    public String AntiInjectionToken;
    public Date AntiInjectionExpireDate;
    //endregion AniInjection
}
