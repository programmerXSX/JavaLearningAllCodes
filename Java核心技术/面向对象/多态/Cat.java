package 面向对象.多态;

public class Cat extends Animal{
    int age = 20;
    String name = "加菲猫";

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void show(){
        System.out.println("我叫加菲猫");
    }
}
