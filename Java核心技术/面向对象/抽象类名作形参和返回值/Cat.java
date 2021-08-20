package 面向对象.抽象类名作形参和返回值;

public class Cat extends Anmial {
    @Override
    public void eat() {
        System.out.println("猫吃屎");
    }

    public int ifNo = 1;
    private int num;
    private String name;
    public Cat() {
    }
    public Cat(int num,String name){
        this.name = name;
        this.num = num;
    }
    public void show(){
        System.out.println("猫吃屎");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
