package 常用工具类.日期类的使用.Date类;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);//CST：Chinese Standard Time中国标准时间

        //Date传参数，表示从标准基准时间起指定的毫秒数
        long date = 1000/*一秒*/*60/*一分钟*/*60/*一小时*/*24/*一天*/;
        Date d2 = new Date(date);
        System.out.println(d2);
        //中国是东八区，加八个小时


        //getTime标准时间到现在的毫秒数
        System.out.println(d2.getTime());
        //setTime，和Date传参差不多
        d2.setTime(date);
        System.out.println(d2);
        long time = System.currentTimeMillis();
        d2.setTime(time);
        System.out.println(d2);
    }
}

