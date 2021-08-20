package 集合框架.集合进阶.List集合.List集合特点;
/*
继承Collection集合
可使用Collection集合的方法
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> L = new ArrayList<String>();
        //List集合可重复
        L.add("xsx");
        L.add("love");
        L.add("jzt");
        L.add("love");
        L.add("me");

        //List可通过迭代遍历
        Iterator<String> it = L.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
