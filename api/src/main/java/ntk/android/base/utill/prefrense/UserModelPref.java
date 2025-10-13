package ntk.android.base.utill.prefrense;

import android.content.Context;

import com.google.gson.Gson;

import ntk.android.base.entitymodel.base.TokenInfoModel;

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

    public void setMemberId(long memberUserId) {
        EasyPreference.with(c).addLong("MemberUserId", memberUserId);
    }

    public Long memberId() {
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

    public void setTokenInfo(TokenInfoModel item) {
        EasyPreference.with(c).addString("Ntk_User_TokenInfoModel", new Gson().toJson(item));
    }

    public TokenInfoModel getTokenInfo() {
        String s = EasyPreference.with(c).getString("Ntk_User_TokenInfoModel", "");
        if (s.equals(""))
            return new TokenInfoModel();
        else
            return new Gson().fromJson(s, TokenInfoModel.class);
    }
}
