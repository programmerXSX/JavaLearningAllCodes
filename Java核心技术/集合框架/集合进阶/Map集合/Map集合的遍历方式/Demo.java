package 集合框架.集合进阶.Map集合.Map集合的遍历方式;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",256);
        map.put("B",128);
        map.put("C",64);
        map.put("D",512);

        //创建对象
        MapTraverseDemo mtd = new MapTraverseDemo();
        //NO.1
        mtd.firstTrverse(map);
        System.out.println("--------------------");
        //NO.2
        mtd.secondTrverse(map);
    }
}
