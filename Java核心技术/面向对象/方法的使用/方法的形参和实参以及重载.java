package 面向对象.方法的使用;

import java.util.*;

public class 方法的形参和实参以及重载 {
    public static void main(String[] args) {

        /*方法重载*/
        System.out.println("请输入两个整数：");
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a2 = sc.nextInt();
        System.out.println("请输入两个字符串：");
        char c1 = sc.next().charAt(0);
        System.out.println("c1 = " + c1);
        System.out.println("请输入第二个字符串：");
        char c2 = sc.next().charAt(0);
        boolean a0 = compare(a1, a2);
        boolean b0 = compare(c1, c2);
        System.out.println(a0 + "   " + b0);


        /*基本数据类型 的形参不改变实参*/
        int m = 10, n = 20;
        swap0(m,n);
        System.out.println("m =" + m+"  n = " +n);


        /*引用类型的形参改变实参*/
        int arr[] = {0,1,2,3,4,5,6,67,8,8};
        change(arr);

    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(char a, char b) {
        return a == b;
    }

    public static void swap0(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void change(int[] a){
        a[2] =100;
        System.out.println("arr[2] = " + a[2]);
    }
}
