package JavaPTA95道题目.题1002_写出这个数;

import java.util.Scanner;

/*
读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字

每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10 的100次方

在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，
但一行中最后一个拼音数字后没有空格。

*/
public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length(), n = 1, sum = 0;
        int[] num = new int[length];
        while (length>0){
//            num[length-1] = Integer.parseInt(str)%(int)Math.pow(10,n++);
            num[length -1] = Integer.parseInt(str.substring(length - 1,length));
            sum = sum + num[length-- - 1];
        }
        String answer = String.valueOf(sum);
        length = answer.length();
        char ch;
        for(int i = 0; i < length; i++){
            ch = answer.charAt(i);
            print(ch);
            System.out.print(" ");
        }
    }
    public static void print(char ch){
        switch (ch){
            case '0':
                System.out.print("ling");
                break;
            case '1':
                System.out.print("yi");
                break;
            case '2':
                System.out.print("er");
                break;
            case '3':
                System.out.print("san");
                break;
            case '4':
                System.out.print("si");
                break;
            case '5':
                System.out.print("wu");
                break;
            case '6':
                System.out.print("liu");
                break;
            case '7':
                System.out.print("qi");
                break;
            case '8':
                System.out.print("ba");
                break;
            case '9':
                System.out.print("jiu");
                break;
        }
    }
}
