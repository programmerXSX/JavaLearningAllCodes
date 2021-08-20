package 并发编程.多线程.线程安全的类;

import java.util.*;

/*
线程安全的类：
        1、StringBuffer:一般用StringBuilder代替，但是StringBuffer安全性高，执行慢；
而StringBuilder执行快，但不如StringBuffer安全性高
        2、Vector:一般用ArrayList集合代替
        3、HashTable:一般用HashMap代替
线程安全类一般应用于多线程之中，共同特点是安全性高但执行慢
 */
public class mainDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        Vector<String> vector = new Vector<>();

        Hashtable<String,String> hashtable = new Hashtable<>();

        /*
        Collections 提供了一个方法：
                public static <T>List<T> synchronizeList(List <T> list)
        返回由指定列表支持的同步（线程安全）列表
         */
        List<String> stringList = Collections.synchronizedList(new ArrayList<String>());
        Map<String, String> stringStringMap = Collections.synchronizedMap(new HashMap<String,String >());
        /*
        这样便得到了支持线程安全的同步列表
         */

    }
}
