package 集合框架.集合;

import java.util.*;

public class ArrayList使用 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        System.out.println(arr.add("xsx"));//add把元素加到集合尾，返回bool
        System.out.println("arr = " + arr);
        arr.add(1,"YES");
        System.out.println(arr);
        arr.add(0,"HHHH");
        System.out.println(arr);

        //集合常见操作
        //1、remove
        arr.remove("xsx");
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);

        //2、set,get, set返回原来的元素
        System.out.println(arr.set(0,"Hello"));
        System.out.println(arr);
        System.out.println(arr.get(0));

        //3、size
        System.out.println(arr.size());
    }
}
