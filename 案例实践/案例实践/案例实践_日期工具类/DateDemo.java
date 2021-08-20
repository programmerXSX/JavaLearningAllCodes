package 案例实践.案例实践_日期工具类;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        DateUtils a = new DateUtils();
        String format = "yyyy-MM-dd HH:mm:ss";
        Date d = new Date();
        String s= a.dateToString(d,format);
        System.out.println(s);

        s = "2021-7-31 8:01:12";
        d = a.stringToDate(s,format);
        System.out.println(d);

    }
}
