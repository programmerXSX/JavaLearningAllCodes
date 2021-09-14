package 接口组成更新.接口中静态方法;

public interface Inter {
    void show();

    default void method(){
        System.out.println("Inter中默认方法");
    }
    //public可以省略
    static void test(){
        System.out.println("Inter中静态方法");
    }
}
