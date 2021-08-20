package 集合框架.集合进阶.Collection集合.Collection集合的遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("xsx");
        c.add("love");
        c.add("jzt");

        Iterator<String> it = c.iterator();
        //next返回迭代中的下一个元素
        System.out.println(it.next());
        System.out.println(it.next());
//        System.out.println(it.next());
        System.out.println("____________________________");
        //hasNext布尔型，如果可以有元素供迭代，返回true
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

    }
}
