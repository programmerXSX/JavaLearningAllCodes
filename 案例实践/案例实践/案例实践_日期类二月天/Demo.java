package 案例实践.案例实践_日期类二月天;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        int sum = c.get(Calendar.DATE);
        System.out.println(year + "年的二月有"  + sum +"天");


    }
}
