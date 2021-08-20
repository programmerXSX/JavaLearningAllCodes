package 集合框架.集合进阶.Map集合.Map集合的遍历方式;

import java.util.*;

public class MapTraverseDemo {
    /*
    第一种方式：
            获取所有键的集合，用keySet方法实现；
            遍历简单集合，获取到每一个键，用增强for循环实现；
            根据键去找值，用get(Object key) 实现
     */
    public static <K ,V> void firstTrverse(Map<K,V> map){
        Set<K> keyMap = map.keySet();
        for (K key:keyMap){
            System.out.println(key + "=" + map.get(key));
        }

    /*
    第二种方式：
            获取所有键值对对象的集合
                    Set<Map.Entry<K,V>>entrySet();
                    这里的Map.Entry<K,V> 相当于一种新的类型，他既包含键类型，
                    又包含值类型，可从中获取键或值的类型
    */
    }
    public static <K,V> void secondTrverse(Map<K,V> map){
        Set<Map.Entry<K,V>> keyMap = map.entrySet();
        for (Map.Entry<K,V> twain:keyMap) {
            K key = twain.getKey();
            V value = twain.getValue();
            System.out.println(twain);//可直接输出
            System.out.println(key + "=" + value);
        }
    }

}
