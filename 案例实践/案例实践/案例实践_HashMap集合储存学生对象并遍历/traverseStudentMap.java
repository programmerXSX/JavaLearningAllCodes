package 案例实践.案例实践_HashMap集合储存学生对象并遍历;

import java.util.Map;
import java.util.Set;

public class traverseStudentMap {
    public static <K,V> void traverse(Map<K,V> map){
        Set<Map.Entry<K,V>> key_value = map.entrySet();
        for (Map.Entry<K,V> me:key_value){
            K k = me.getKey();
            V v = me.getValue();
            System.out.println(k + "=" + v);
        }
    }
}
