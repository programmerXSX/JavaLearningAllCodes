package 常用工具类.随机数与输入语句;
import java.util.*;

public class 随机数 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(10);//获取0-9之间的数字
        System.out.println("a = " + a);
    }
}
