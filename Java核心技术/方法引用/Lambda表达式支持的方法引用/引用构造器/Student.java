package 方法引用.Lambda表达式支持的方法引用.引用构造器;

public class Student {
    int age;
    String name;

    public Student() {
    }

    public Student( String name,int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
