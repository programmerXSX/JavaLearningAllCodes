package 接口组成更新.接口中默认方法;

public interface MyInterface {
    void show1();
    void show2();

    //默认方法
    //public可以省略
//    public default void show3(){
//        System.out.println("默认方法 show3()");
//    }
    default void show3(){
        System.out.println("默认方法 show3()");
    }
}
