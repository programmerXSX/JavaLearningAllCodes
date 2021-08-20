package 集合框架.集合进阶.Set集合.Set集合特点;
/*
Set集合特点：不包含重复元素，没有带索引的方法
不能使用普遍for循环遍历，可以用增强for循环
HashSet：对集合的迭代顺序不做任何保证，集合元素是乱序随机的
 */

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("I");
        set.add("am");
        set.add("superman");

        for(String s:set){
            System.out.println(s);
        }
     }
}
