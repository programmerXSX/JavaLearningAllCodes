package 异常处理.异常.自定义异常;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        teacher t = new teacher();
        System.out.println("please input score:");
        Scanner sc= new Scanner(System.in);
        int score = sc.nextInt();
        try {
            t.checkScore(score);
        } catch (customException e) {
            e.printStackTrace();
        }
    }
}
