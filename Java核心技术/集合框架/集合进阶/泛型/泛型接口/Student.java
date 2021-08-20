package 集合框架.集合进阶.泛型.泛型接口;

public class Student implements GenericInterface{
    @Override
    public <T> void show(T t) {
        System.out.println(t);
    }
}
