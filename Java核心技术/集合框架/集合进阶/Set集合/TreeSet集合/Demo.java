package 集合框架.集合进阶.Set集合.TreeSet集合;
/*
TreeSet集合特点
        1、元素有序， 这里的顺序不是指储存和取出的顺序，而是按照一定的规则进行排序，
        具体排序方法取决于构造方法：
                TreeSet（）：根据其元素的自燃排序进行排序
                TreeSet（Comparator  comparator）:根据指定的比较器进行排序
       2、没有带索引 的方法，所以不能使用普通for循环
       3、是Set集合，不包含重复元素
*/

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<String> ts0 = new TreeSet<>();
        ts0.add("xsx");
        ts0.add("is");
        ts0.add("my");
        ts0.add("name");
        ts0.add("is");
        for (String s:ts0){
            System.out.println(s);
        }
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(12);
        ts1.add(545);
        ts1.add(12);
        ts1.add(89);
        for (int i:ts1){
            System.out.println(i);
        }
    }
}
