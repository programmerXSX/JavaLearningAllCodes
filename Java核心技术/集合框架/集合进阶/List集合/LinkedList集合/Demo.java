package 集合框架.集合进阶.List集合.LinkedList集合;
/*
LinkedList与ArrayList区别不大，只不过新增了add,get,remove的
首末位置方法——Last,First,具体如下：

 */
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> lkt  = new LinkedList<>();
        lkt.add("xsx");
        lkt.add("love");
        lkt.add("jzt");

        lkt.addFirst("I'm");
        lkt.addLast("forever");

        String s1 = lkt.getFirst();
        String s2 = lkt.getLast();
        System.out.println(s1+"\n"+s2);

        lkt.removeFirst();
        lkt.removeLast();
        System.out.println(lkt);

    }
}
