package 常用工具类.日期类的使用.SimpleDateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        /*
        常用的模式字母与对应关系如下
        y ——年
        M——月
        d——日
        H——时
        m——分
        s——秒
         */
        Date a =new Date();
        //SimpleDateFormat是一个格式转化方法
        //format是从Date到String
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy年MM月dd日  HH：mm：ss");
        String s = sdf.format(a);
        System.out.println(s);

        String s1 = "2021-7-30 23:11:12";
        //parse是从String到Date；
        SimpleDateFormat sdf1 = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss"
        );
        Date b = sdf1.parse(s1);
        System.out.println(b);


    }
}
