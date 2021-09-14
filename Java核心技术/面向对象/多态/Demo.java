package 面向对象.多态;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.age);
        a.eat();
        Animal b = new Dog();
        System.out.println(b.age);
        b.eat();
    }
}
