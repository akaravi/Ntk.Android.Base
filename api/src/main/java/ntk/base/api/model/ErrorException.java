package ntk.base.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorException {

    @SerializedName("IsSuccess")
    public boolean IsSuccess;

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

    @SerializedName("UserTicketToken")
    public String UserTicketToken;

    @SerializedName("Errors")
    public List<ErrorInfo> Errors;
}

class ErrorInfo {
    @SerializedName("ErrorMessage")
    public String ErrorMessage;

    @SerializedName("ErrorType")
    public int ErrorType;
}