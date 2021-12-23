package ntk.android.base.utill;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ntk.android.base.config.NetworkDiscovery;

public class AppUtil {

    public static boolean isNetworkAvailable(Context context) {
        return NetworkDiscovery.isNetworkAvailable(context);
    }

    public static String GetDeviceName() {
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        if (model.startsWith(manufacturer)) {
            return capitalize(model);
        }
        return capitalize(manufacturer) + " " + model;
    }

    private static String capitalize(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] arr = str.toCharArray();
        boolean capitalizeNext = true;

        StringBuilder phrase = new StringBuilder();
        for (char c : arr) {
            if (capitalizeNext && Character.isLetter(c)) {
                phrase.append(Character.toUpperCase(c));
                capitalizeNext = false;
                continue;
            } else if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            }
            phrase.append(c);
        }

        return phrase.toString();
    }

    public static String GetVersion(Context context) {
        String version = "";
        try {
            PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            version = pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }

    public static String GregorianToPersian(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return GregorianToPersian(sdf.format(d));
    }

    public static String GregorianToPersian(String value) {
        String[] Value = value.split("T");
        String[] date = Value[0].split("-");
        String result = "";

        try {
            int e = Integer.parseInt(date[0]);
            int m = Integer.parseInt(date[1]);
            int d = Integer.parseInt(date[2]);
            if (e != 0 || m != 0 || d != 0) {
                DateUtil roozh = new DateUtil();
                roozh.GregorianToPersian(e, m, d);
                result = roozh.toString();
                result = result.replace("-", "/");
            }
        } catch (Exception var8) {
            result = "Error Convert Date";
        }

        return result;
    }

    public static Date Now() {
        return new Date(System.currentTimeMillis());
    }

    public static String DateDifference(String startDate, String endDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
        Date date1 = null, date2 = null;
        try {
            date1 = simpleDateFormat.parse(startDate);
            date2 = simpleDateFormat.parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return DateDifference(date1, date2);

    }


    public static String DateDifference(Date startDate, Date endDate) {
        //milliseconds
        if (startDate != null && endDate != null) {
            long different = endDate.getTime() - startDate.getTime();

            long secondsInMilli = 1000;
            long minutesInMilli = secondsInMilli * 60;
            long hoursInMilli = minutesInMilli * 60;
            long daysInMilli = hoursInMilli * 24;

            long elapsedDays = different / daysInMilli;
            different = different % daysInMilli;

            long elapsedHours = different / hoursInMilli;
            different = different % hoursInMilli;

            long elapsedMinutes = different / minutesInMilli;
            different = different % minutesInMilli;

            long elapsedSeconds = different / secondsInMilli;
            if (elapsedDays > 0)
                return elapsedDays + " روز قبل ";
            if (elapsedHours > 0)
                return elapsedHours + " ساعت قبل ";
            if (elapsedMinutes > 0)
                return elapsedMinutes + " دقیقه قبل ";
            else return "لحظاتی قبل";
        } else
            return "نامشخص";
    }

    public static String DateDifferenceNow(Date createdDate) {
        return DateDifference(createdDate, Now());
    }
}

