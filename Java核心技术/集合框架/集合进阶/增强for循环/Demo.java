package 集合框架.集合进阶.增强for循环;
/*
增强for循环用来简化数组和Collection集合的遍历
与python较为相似
格式如下：
        for(元素数据类型  变量名：数组或者Collection集合）{
        此处使用的变量即为元素
        ……
        }
 */

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i:arr){
            System.out.println(i);
        }
        System.out.println("------------------------");
        String[] str = {"xsx" ,"love", "jzt"};
        for (String s:str){
            System.out.println(s);
        }
        System.out.println("------------------------");
        List<String> list = new ArrayList<>();
        list.add("xsx");
        list.add("love");
        list.add("jzt");
        for (String s:list){
            System.out.println(s);
        }
/*
增强for循环内部原理是迭代器，可用并发修改异常验证
 */
        /*
        for (String s:list){
            if (s.equals("xsx")){
                list.add("ccjj");

                //这里会抛出异常，说明是迭代器原理

            }
        }
        */
    }
}
