package 集合框架.集合进阶.泛型.可变参数;

public class ArgsDemo {
    public static void main(String[] args) {
        show(18, "xsx", 98, 85, 65);
    }

    public static void show(int age, String name, int... a) {
        System.out.println("姓名是：" + name);
        System.out.println("年龄是：" + age);
        int num = 0;
        for (int i : a) {
            num += i;
        }
        System.out.println("总分是：" + (num));
    }
}
