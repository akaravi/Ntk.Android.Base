package ntk.android.base.utill.prefrense;

import android.content.Context;

public class ArticleVariableInfo {
    Context c;

    ArticleVariableInfo(Context c) {
        this.c = c;
    }

    public String articleContentList() {
        return EasyPreference.with(c).getString("articleContentList","");
    }

    public void setArticleContentList(String valueOf) {
         EasyPreference.with(c).addString("articleContentList",valueOf);
    }
}
