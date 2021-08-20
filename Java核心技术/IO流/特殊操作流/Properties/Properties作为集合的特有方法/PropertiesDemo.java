package IO流.特殊操作流.Properties.Properties作为集合的特有方法;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        //properties可以当作Map集合使用,通过使用put方法实现
        Properties per  = new Properties();
        per.put("xai","nsknd");
        per.put("jhb","nsknd");
        per.put("klnk","nsknd");
        per.put("xhii","nsknd");
        /*
        put方法底层调用Map集合的put方法
                public synchronized Object put(Object key, Object value) {
                return map.put(key, value);
            }
         */


                //Object setProperty(String key, String value):设置集合的键和值，都是String类型，底层调用Hashtable的put方法
       per.setProperty("夏敏","猪头");
        /*
                底层代码依然是put方法
                public synchronized Object setProperty(String key, String value) {
                return put(key, value);
            }
         */

                //String getProperty(String key) : 使用此属性列表中指定的键搜索属性
        System.out.println(per.getProperty("夏敏"));

                //Set<String> stringPropertyNames(): 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
        Set<String> stringSet = per.stringPropertyNames();
        /*
        底层代码调用HashMap集合的keySet方法
            public Set<String> stringPropertyNames() {
                Map<String, String> h = new HashMap<>();
                enumerateStringProperties(h);
                return Collections.unmodifiableSet(h.keySet());
            }
         */


        //遍历集合
        Set<Object> objects = per.keySet();
        //与stringPropertyNames方法作用相同、
        for (Object obj:objects){
            System.out.println(obj + " = "+per.get(obj));
        }
    }
}
