package 案例实践.案例实践_运动员和教练;

public abstract class Person {
    int age;
    String name;
    public Person(){}
    public  Person(String name,int age) {
        this.age = age;
        this.name = name;
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("任务：出国学习");
    }
}
