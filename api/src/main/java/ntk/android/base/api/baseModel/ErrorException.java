package ntk.android.base.api.baseModel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Map;

public class ErrorException {

    @SerializedName("IsSuccess")
    public boolean IsSuccess;

    @SerializedName("Status")
    public int Status;

    @SerializedName("ErrorMessage")
    public String ErrorMessage;

    @SerializedName("ErrorType")
    public int ErrorType;

    @SerializedName("CurrentPageNumber")
    public int CurrentPageNumber;

    @SerializedName("TotalRowCount")
    public int TotalRowCount;

    @SerializedName("RowPerPage")
    public int RowPerPage;

    @SerializedName("token")
    public String token;

    @SerializedName("Errors")
    public Map<String, ArrayList<String>> Errors;
}
