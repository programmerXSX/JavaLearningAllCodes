package 案例实践.案例实践_猫和狗;

public  class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void work() {
        System.out.println("狗看门 ");
    }
}
