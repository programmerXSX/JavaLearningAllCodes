package 标准类的制作;

public class Person {
    private String name;
    private int age;
    private String home;
    private String ID ;
    private String phone;

    public Person(){ }
    public Person(String name, int age, String home, String ID, String phone){
        this.age  = age;
        this.ID = ID;
        this.phone = phone;
        this.home = home;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void show(){
        System.out.println("姓名：" +name);
        System.out.println("年龄：" + age);
        System.out.println("联系方式：" + phone);
        System.out.println("身份证号：" + ID);
        System.out.println("家庭住址：" + home);
    }
}
