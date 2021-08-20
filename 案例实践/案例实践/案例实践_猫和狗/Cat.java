package 案例实践.案例实践_猫和狗;

public   class Cat extends Animal{

    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }
    @Override
    public void work() {
        System.out.println("猫抓鱼");
    }

}
