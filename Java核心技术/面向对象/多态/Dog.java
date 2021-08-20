package 面向对象.多态;

public class Dog extends Animal{
    int age = 30;
    String name = "欧迪";

    @Override
    public void eat() {
        System.out.println("欧迪狗不吃🐟");
    }
}
