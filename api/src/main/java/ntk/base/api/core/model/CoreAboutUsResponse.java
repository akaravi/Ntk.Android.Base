package ntk.base.api.core.model;

import com.google.gson.annotations.SerializedName;

import ntk.base.api.article.model.ArticleContent;
import ntk.base.api.model.ErrorException;

public class CoreAboutUsResponse extends ErrorException {

    @SerializedName("Item")
    public CoreAbout Item;
}