package homework.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd:MM:yyyy");

    public static Date stringToDate(String value) throws ParseException {
        if (value == null) {
            return null;
        }
        return SDF.parse(value);
    }

    public static String dateToString(Date value) {
        if (value == null) {
            return null;
        }
        return SDF.format(value);
    }
}
