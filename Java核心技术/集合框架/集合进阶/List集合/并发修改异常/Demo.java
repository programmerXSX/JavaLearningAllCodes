package 集合框架.集合进阶.List集合.并发修改异常;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("xsx");
        list.add("love");
        list.add("jzt");

        Iterator<String> it = list.iterator();
//
//        while (it.hasNext()) {
//            String s = it.next();
//            if (s.equals("xsx")) {
//                list.add("ccjj");
//            }
//        }
/*
add方法中modCount++，与 exceptedModCount不相同会报错
而list.get方法不会做++操作，不会报错
 */
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("xsx")) {
                list.add("ccjj");
            }
        }
        System.out.println(list);

    }
}
