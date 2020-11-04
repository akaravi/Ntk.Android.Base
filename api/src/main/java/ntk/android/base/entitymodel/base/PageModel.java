package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

class PageModel {
    @SerializedName("pageNumber")
    int pageNumber = 0;
    @SerializedName("totalElements")
    long totalElements;
    @SerializedName("size")
    int size = 20;
}
