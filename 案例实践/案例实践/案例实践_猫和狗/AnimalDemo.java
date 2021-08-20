package 案例实践.案例实践_猫和狗;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat(2, "加菲猫");
        System.out.println("年龄：" + a.getAge()+"\n名字：" +a.getName());
        System.out.println("工作：" );
                a.work();


        Animal b = new Dog(3, "欧迪");
        System.out.println("年龄：" + b.getAge()+ "\n名字 ：" + b.getName());
        System.out.println("工作：");
        b.work();

    }
}
