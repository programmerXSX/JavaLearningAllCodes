package 面向对象.继承;

public class Demo {
    public static void main(String[] args) {


        Father f1 = new Father();
        f1.show();

        Son s1 = new Son();
        s1.method();
        s1.show();
        s1.print();


        s1.visit();
    }
}
