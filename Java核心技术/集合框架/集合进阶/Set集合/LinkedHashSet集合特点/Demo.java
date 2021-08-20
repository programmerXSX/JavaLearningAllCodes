package 集合框架.集合进阶.Set集合.LinkedHashSet集合特点;
/*
LinkedHashSet集合特点：
        1、哈希表和链表实现的Set接口，具有可预测的迭代顺序
        2、由链表保证元素有序，也就是说元素的储存和取出顺序是一致的
        3、由哈希表保证元素的不重复
 */

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bcds");
        lhs.add("uhicfni");
        lhs.add("sa");
        lhs.add("sa");
        for (String s:lhs){
            System.out.println(s);
        }
    }
}
