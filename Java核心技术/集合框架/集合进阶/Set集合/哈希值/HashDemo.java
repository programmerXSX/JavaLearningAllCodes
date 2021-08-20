package 集合框架.集合进阶.Set集合.哈希值;

public class HashDemo {
    public static void main(String[] args) {
        Person p0 = new Person("xsx",122);
        Person p1 = new Person("xsx",122);
        System.out.println(p0.hashCode());//返回对象对应的哈希值
        System.out.println(p1.hashCode());//默认情况下，不同对象对应不同且唯一的哈希值
        Person p2 = new Person("jzt",124);       //方法重写可以改变哈希值
        System.out.println(p2.hashCode());
        System.out.println("------------");
        /*
        字符串一样有对应的哈希值，但是可能相同，也可能不同，没有参考价值
         */


    }
}
