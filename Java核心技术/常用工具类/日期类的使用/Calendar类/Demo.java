package 常用工具类.日期类的使用.Calendar类;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        //Calendar是日历字段，其中 的时间是连续的日历的形式
        Calendar ca = Calendar.getInstance();//多态形式得到对象
        //Calendar中的月份从0开始

        //add可以将指定对象加上数值
        ca.add(Calendar.YEAR,10);

        //set可以设置时间
        ca.set(2021,12,4);

        //get可以获得相应字段的整型
        int year = ca.get(Calendar.YEAR);
        int month = ca.get(Calendar.MONTH) + 1;
        int day = ca.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + day + "日");

    }
}
