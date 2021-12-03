package ntk.android.base.entitymodel.base;

import com.google.gson.annotations.SerializedName;

public class PageModel {
    @SerializedName("PageNumber")
    public  int PageNumber = 0;
    @SerializedName("TotalElements")
    public  long TotalElements;
    @SerializedName("Size")
    public    int Size = 20;
}
