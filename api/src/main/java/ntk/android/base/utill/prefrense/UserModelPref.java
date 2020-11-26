package ntk.android.base.utill.prefrense;

import android.content.Context;

public class UserModelPref {
    private final Context c;

    UserModelPref(Context context) {
        this.c = context;
    }

    public String mobile() {
        return EasyPreference.with(c).getString("Ntk_mobile_key", "");
    }

    public void setMobile(String s) {
        EasyPreference.with(c).addString("Ntk_mobile_key", s);
    }

    public Long linkUserId() {
        return EasyPreference.with(c).getLong("Ntk_linkUser_key", 0);
    }

    public void setLinkUserId(Long userID) {
         EasyPreference.with(c).addLong("Ntk_linkUser_key", userID);
    }
    public Long userId() {
        return EasyPreference.with(c).getLong("Ntk_userId", 0);
    }
    public void setUserId(long userId) {
        EasyPreference.with(c).addLong("Ntk_userId", userId);
    }
    public Long siteId() {
        return EasyPreference.with(c).getLong("Ntk_siteId", 0);
    }
    public void setSiteId(long siteId) {
        EasyPreference.with(c).addLong("Ntk_siteId", siteId);
    }
    public void setMemberUserId(long memberUserId) {
        EasyPreference.with(c).addLong("MemberUserId", memberUserId);
    }
    public Long memberUserId() {
        return EasyPreference.with(c).getLong("MemberUserId", 0);
    }

    public String theme() {
        return EasyPreference.with(c).getString("Theme", "");
    }

    public void seTheme(String s) {
        EasyPreference.with(c).addString("Theme", s);
    }

    public Object linkMemberId() {
        return EasyPreference.with(c).getLong("Ntk_linkMemberId", 0);
    }

}
