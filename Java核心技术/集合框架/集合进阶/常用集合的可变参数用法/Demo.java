package 集合框架.集合进阶.常用集合的可变参数用法;
/*
Arrays工具类中有一个静态方法：
        pubilc static <T> List<T> asList(T...a):返回由指定数组支持的固定大小的列表
List接口中有一个静态方法：
        public static <E> List<E> of (E...elements):返回包含容易数量元素的不可变列表
Set接口中有一个静态方法：
        pubic static <E> Set<E> of (E...elements):返回一个包含任意数量元素的不可变集合
 */

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String > list = Arrays.asList("biubv", " iugusd" , " shvj");
//        list.add("njbjkv");//数量不可变
        list.set(0,"jkbsdjb");

        List<String> list1 = List.of("jhbjf","jkhsid", "oijsfif");
        //不可改变

        Set<String> set = Set.of("jbhjdsf","sjf","uisdfb");
        //不能有重复元素，而且不可变集合




    }
}
