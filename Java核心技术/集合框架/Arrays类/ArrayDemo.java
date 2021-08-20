package 集合框架.Arrays类;
import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] =  {1,3,5,2,3,5,6,6,8,8,6};
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));

    }
}
