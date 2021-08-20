package 集合框架.集合进阶.List集合.List集合的特有迭代方法ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("xsx");
        list.add("love");
        list.add("jzt");

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("----------------------------");
        //与next用法相同，不过，previous是逆序遍历
        while (lit.hasPrevious()){
            String s = lit.previous();
            System.out.println(s);
        }
        System.out.println("------------------");
        while (lit.hasPrevious()){
            String s = lit.previous();
            if (s.equals("xsx")){
                lit.add("ccjj");
                /*
    注意此处的add方法与前面不同，前面是对list使用add，这里是对listiterator
对象进行add操作，与直接对列表add操作不同的是，在迭代器add操作时，modCount
会在每次add操作之后做“modCount = exceptionModCount”操作，保证一直相同，
不会出现异常
                 */
            }
        }
        System.out.println(list);
    }
}
