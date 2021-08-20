package 集合框架.集合进阶.Map集合.Map集合的获取功能;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("A","I'm");
        map.put("B","a");
        map.put("C","superman");

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("C"));
        //根据键获取值

        Set<String> keyMap = map.keySet();
        System.out.println(keyMap);
        //获取所有键的集合

        Collection<String> valueMap = map.values();
        System.out.println(valueMap);
        //获取所有值的集合



    }
}
