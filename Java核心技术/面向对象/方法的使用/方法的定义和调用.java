package 面向对象.方法的使用;

import java.util.*;

public class 方法的定义和调用 {
    public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        isNumber(a);
    }

    public static void isNumber(int a) {
        if (a % 2 == 0) {
            System.out.println(a + "是偶数");
        } else {
            System.out.println(a + "不是偶数");
        }
    }
}
