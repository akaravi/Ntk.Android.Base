package ntk.android.base.utill.prefrense;

import android.content.Context;

public class TicketVariableInfo {

    private Context c;

    TicketVariableInfo(Context c) {
        this.c = c;
    }

    public String nameFamily() {
        return EasyPreference.with(c).getString("nameFamily", "");
    }
    public void setNameFamily(String toString) {
        EasyPreference.with(c).addString("nameFamily", toString);
    }
    public String mobile() {
        return EasyPreference.with(c).getString("mobile", "");
    }
    public void setMobile(String toString) {
        EasyPreference.with(c).addString("mobile", toString);
    }
    public String email() {
        return EasyPreference.with(c).getString("email", "");
    }

    public void setEmail(String toString) {
        EasyPreference.with(c).addString("mobile", toString);
    }


}
