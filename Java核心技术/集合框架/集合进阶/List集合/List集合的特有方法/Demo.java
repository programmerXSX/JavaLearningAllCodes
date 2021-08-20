package 集合框架.集合进阶.List集合.List集合的特有方法;

/*
List集合与前面 的Arraylist一样用法
 */
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> L = new ArrayList<String>();
        L.add("XSX");
        L.add(0,"love");
        //与Collection不同，List可以在指定位置添加元素

        System.out.println(L.size());
        //输出集合长度

        System.out.println(L.remove("XSX"));
        System.out.println(L.remove(0));
        //remove删除指定元素或索引位置元素
        //指定元素返回布尔值
        //索引元素返回被删除元素

        L.add(" ");
        System.out.println(L.set(0,"xsx"));
        System.out.println(L.set(0,"love"));
        //set将指定位置修改，并返回被修改元素
        //索引位置不能为空

        System.out.println(L.get(0));
        //get获取索引位置元素并返回


        System.out.println(L);

    }
}
