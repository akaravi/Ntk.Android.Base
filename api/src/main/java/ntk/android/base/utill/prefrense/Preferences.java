package ntk.android.base.utill.prefrense;

import android.content.Context;

public class Preferences {
    public static Preferences.Builder with(Context context) {
        return new Preferences.Builder(context);
    }


    public static class Builder {
        Context context;

        public Builder(Context context) {
            this.context = context;
        }

        public UserModelPref UserInfo() {
            return new UserModelPref((context));
        }

        public DebugInfo debugInfo() {
            return new DebugInfo(context);
        }

        public TokenInfo tokenInfo() {
            return new TokenInfo(context);
        }

        public AppVariableInfo appVariableInfo() {
            return new AppVariableInfo(context);
        }

        public TicketVariableInfo ticketVariableInfo() {
            return new TicketVariableInfo(context);
        }

        public String email() {
            return null;
        }


        public ArticleVariableInfo articleInfo() {
            return new ArticleVariableInfo(context);
        }
    }
}
