package 集合框架.集合进阶.Collection集合.Collection的常用方法;
/*
注意这是集合，与ArrayList区分
 */

import java.util.*;
public class Demo {
    public static void main(String[] args) {
        //创建Collection对象
        Collection<String> co = new ArrayList<String>();
        System.out.println(co.add("xsx"));//add添加元素，返回布尔型
        co.add("hhhh");

        //remove移除元素，返回布尔值
        System.out.println(co.remove("hhhh"));
        System.out.println(co.remove("dvsv"));

        //contains是否含有指定元素，返回布尔型
        System.out.println(co.contains("xsx"));

        //isEmpty判断是否为空,返回布尔值
        System.out.println(co.isEmpty());

        //size返回集合的长度，即元素个数
        System.out.println(co.size());

        System.out.println(co);

        //clear清空所有元素
        co.clear();

        System.out.println(co);

    }

}
