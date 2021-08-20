package 集合框架.集合进阶.Map集合.Map集合的基本方法;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //put添加元素
        map.put("aaa","I'm");
        map.put("bbb","an");
        map.put("ccc","apple");

        //remove删除元素
        map.remove("aaa");

        //containKey和containValue判断是否包含相应的键或值
        System.out.println(map.containsKey("aaa"));
        System.out.println(map.containsValue("an"));

        //size返回集合的长度
        System.out.println(map.size());
        System.out.println(map);

        //clear清空集合
        map.clear();

        //IsEmpty判断是否是空集合
        System.out.println(map.isEmpty());



    }
}
