package ntk.android.base.api.utill;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NTKUtill {

    public static int Descnding_Sort = 0;
    public static int Ascnding_Sort = 1;
    public static int Random_Sort = 2;

    public static int Search_Type_Equal = 0;
    public static int Search_Type_NotEqual = 1;
    public static int Search_Type_LessThan = 2;
    public static int Search_Type_GreaterThan = 3;
    public static int Search_Type_Between = 4;
    public static int Search_Type_Contains = 5;
    public static int Search_Type_NotContains = 6;
    public static int Search_Type_BeginsWith = 8;
    public static int Search_Type_EndsWith = 9;
    public static int Search_Type_LessThanOrEqualTo = 10;
    public static int Search_Type_GreaterThanOrEqualTo = 11;

    public static int ClauseType_Or = 1;
    public static int ClauseType_And = 2;

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }


}
