package ntk.android.base.utill.prefrense;

import android.content.Context;

public class DebugInfo {
    private final Context c;

    DebugInfo(Context context) {
        this.c = context;
    }

    public int count() {
        return EasyPreference.with(c).getInt("NTK_TEST_COUNT", 0);
    }

    public void setCount(int s) {
        EasyPreference.with(c).addInt("NTK_TEST_COUNT",s);
    }
    public String url() {
        return EasyPreference.with(c).getString("NTK_TEST_URL", "");
    }

    public void setUrl(String s) {
        EasyPreference.with(c).addString("NTK_TEST_URL", s);
    }

    public String packageName() {
        return EasyPreference.with(c).getString("NTK_TEST_PACKAGENAME", "");
    }

    public void setPackageName(String s) {
        EasyPreference.with(c).addString("NTK_TEST_PACKAGENAME", s);
    }
}
