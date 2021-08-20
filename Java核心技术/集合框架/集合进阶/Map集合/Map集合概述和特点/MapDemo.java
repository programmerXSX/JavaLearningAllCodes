package 集合框架.集合进阶.Map集合.Map集合概述和特点;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        //底层数据是哈希表，不能保证顺序

        // V put (K key, V value) 将指定的值与该映射的指定键相关联
        map.put("xxx",12);
        map.put("sss",45);
        map.put("sss",89);//相同键值会修改前面的映射值
        System.out.println(map);

    }
}
