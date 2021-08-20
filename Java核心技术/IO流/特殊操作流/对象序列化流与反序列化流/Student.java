package IO流.特殊操作流.对象序列化流与反序列化流;

import java.io.Serializable;

public class Student implements Serializable {
            //Serializable是一个标识接口，表示该类的对象可以被序列化和反序列化
            //无重写方法
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
